import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import org.tempuri.CRONUS_Sverige_AB_Employee;
import org.tempuri.CronusServiceSoapProxy;

public class Controller {
	private EmployeeFrame employeeFrame; // Instance variable EmployeeFrame
	private CronusServiceSoapProxy proxy = new CronusServiceSoapProxy(); // Instantiate the SoapProxy as an instance variable
																			

	public Controller(EmployeeFrame employeeFrame) { // Constructor
		this.employeeFrame = employeeFrame; // Set the instance variable to the input employeeFrame
		this.defineListeners(); // This will activate the actionListeners
		this.updateTableModel(); // This will update the TableModel
	}

	public void updateTableModel() { // Shows the values in the table (gui)
		try {
			CRONUS_Sverige_AB_Employee[] employees = proxy.getEmployees(); // Array with employees fetch from the db using proxy
			if (employees.length != 0) { // If there is no employees, nothing should be added to the table
				for (CRONUS_Sverige_AB_Employee employee : employees) { // Iterate through the employees
					employeeFrame.getEmployeeTableModel().addEmployee(employee); // Adds an employee to the table
				}
			}
		} catch (RemoteException e) { // Catch exceptions throws from the web service
			e.printStackTrace();
		}
	}

	public void defineListeners() { // Method for defining listeners

		// btnCreate
		employeeFrame.getBtnCreate().addActionListener(new ActionListener() { // Add actionsListener
			public void actionPerformed(ActionEvent e) {
				String No = employeeFrame.getTxtFieldNo().getText(); // Get input from the TextFields
				String FirstName = employeeFrame.getTxtFieldFirstName().getText(); // Get input from the TextFields
				String LastName = employeeFrame.getTxtFieldLastName().getText(); // Get input from the TextFields
				String JobTitle = employeeFrame.getTxtFieldJobTitle().getText(); // Get input from the TextFields
				String Address = employeeFrame.getTxtFieldAddress().getText(); // Get input from the TextFields

				if (No.equals("") || FirstName.equals("") || LastName.equals("") || JobTitle.equals("")
						|| Address.equals("")) { // Error handling. If the user does not fill in all the text fields, an error message will pop up
					employeeFrame.displayErrorMessage("Error Occured. Please make sure that all fields are filled in.");
					return;
				}

				CRONUS_Sverige_AB_Employee tmpEmployee = new CRONUS_Sverige_AB_Employee(); // Create a new employee (object)
				tmpEmployee.setNo_(No); // Used the input to set tmpEmployees properties
				tmpEmployee.setFirst_Name(FirstName); // Used the input to set tmpEmployees properties
				tmpEmployee.setLast_Name(LastName); // Used the input to set tmpEmployees properties
				tmpEmployee.setJob_Title(JobTitle); // Used the input to set tmpEmployees properties
				tmpEmployee.setAddress(Address); // Used the input to set tmpEmployees properties

				try {
					proxy.addEmployee(No, FirstName, LastName, JobTitle, Address); // Adds new employee to database
					employeeFrame.getEmployeeTableModel().addEmployee(tmpEmployee); // Add employee shows in the table
					employeeFrame.clearTextFields(); // Clear the text fields after the action event
				} catch (RemoteException e1) { // An error message
					employeeFrame.displayErrorMessage(
							"Error Occured. Please make sure that all fields are filled in and that No is unique.");
				}
			}
		});

		// btnDelete
		employeeFrame.getBtnDelete().addActionListener(new ActionListener() { // Add actionsListener
			public void actionPerformed(ActionEvent e) {

				try {
					int rowIndex = employeeFrame.getEmployeeTable().getSelectedRow(); // Retrieve the index of selected row

					String No = employeeFrame.getEmployeeTableModel().getValueAt(rowIndex, 0).toString(); // Retrieve No at that row
					proxy.deleteEmployee(No); // Delete the employee in the database using the retrieved No
					employeeFrame.getEmployeeTableModel().removeEmployee(rowIndex); // The employee deletes from the table
				} catch (RemoteException e1) { // Catch
					employeeFrame.displayErrorMessage("Error Occured.");
				} catch (IndexOutOfBoundsException e2) { // Catch when the user does not chose an employee to delete
					employeeFrame
							.displayErrorMessage("Error Occured. Please select a row in the table before deleting");

				}

			}
		});

		// btnUpdate
		employeeFrame.getBtnUpdate().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String FirstName = employeeFrame.getTxtFieldFirstName().getText(); // Get input from the TextFields
					String LastName = employeeFrame.getTxtFieldLastName().getText(); // Get input from the TextFields
					String JobTitle = employeeFrame.getTxtFieldJobTitle().getText(); // Get input from the TextFields
					String Address = employeeFrame.getTxtFieldAddress().getText(); // Get input from the TextFields

					if (FirstName.equals("") && LastName.equals("") && JobTitle.equals("") && Address.equals("")) {
						employeeFrame
								.displayErrorMessage("Error Occured. Please make sure to fill in at least one field."); // Error handling. If the user does not fill in
																														//.. all the text fields, an error message will pop up
																														
						return;
					}

					int rowIndex = employeeFrame.getEmployeeTable().getSelectedRow(); // Retrieved index of the selected row							

					String No = employeeFrame.getEmployeeTableModel().getValueAt(rowIndex, 0).toString(); // Get the No at the retrieved row, [0]																					
					proxy.updateEmployee(No, FirstName, LastName, JobTitle, Address); // Update employee in the database
					employeeFrame.clearTextFields(); // Clears the text fields after the action
				} catch (RemoteException e1) { // Catch
					employeeFrame.displayErrorMessage("Error Occured.");
				} catch (IndexOutOfBoundsException e2) { // Catch when the user does not chose an employee to delete
					employeeFrame.displayErrorMessage("Error Occured. Please select a row before updating.");
				}

			}
		});
		// btnFind
		employeeFrame.getBtnFind().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String No = employeeFrame.getTxtFieldNo().getText(); // Get No from the text field
					CRONUS_Sverige_AB_Employee tmpEmployee = proxy.findEmployee(No); // Search for employee in the database
					employeeFrame.getTxtAreaFindEmployee().setText( // Set text
							"First Name: " + tmpEmployee.getFirst_Name() + "\n" + // (one statement)
					"Last Name: " + tmpEmployee.getLast_Name() + "\n" + "Job Title: " + tmpEmployee.getJob_Title()
									+ "\n" + "Address: " + tmpEmployee.getAddress());
					employeeFrame.clearTextFields(); // Clear text fields after using it

				} catch (RemoteException e1) { // Catch
					employeeFrame.displayErrorMessage("Error Occured. Could not find an employee with the given No.");

				}

			}
		});
	}
}
