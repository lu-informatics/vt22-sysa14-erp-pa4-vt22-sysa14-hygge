import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import org.tempuri.CRONUS_Sverige_AB_Employee;
import org.tempuri.CronusServiceSoapProxy;

public class Controller {
		private EmployeeFrame employeeFrame; 
		private CronusServiceSoapProxy proxy = new CronusServiceSoapProxy();
		
		public Controller (EmployeeFrame employeeFrame) {
			this.employeeFrame = employeeFrame; 
			this.defineListeners();
			this.updateTableModel();
		}
		
		public void updateTableModel() {
			try {
				CRONUS_Sverige_AB_Employee[] employees = proxy.getEmployees();
				if (employees.length != 0) { // Maybe remove?
					for (CRONUS_Sverige_AB_Employee employee : employees) {
						employeeFrame.getEmployeeTableModel().addEmployee(employee);
					}
				}
			} catch (RemoteException e) { // Kolla error hantering!
				e.printStackTrace();
			}
		}
		
		public void defineListeners() {
			
			// btnCreate
			employeeFrame.getBtnCreate().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String No = employeeFrame.getTxtFieldNo().getText(); 
					String FirstName = employeeFrame.getTxtFieldFirstName().getText();
					String LastName = employeeFrame.getTxtFieldLastName().getText();
					String JobTitle = employeeFrame.getTxtFieldJobTitle().getText();
					String Address = employeeFrame.getTxtFieldAddress().getText(); 
					
					if (No.equals("") || FirstName.equals("") || LastName.equals("") || JobTitle.equals("") || Address.equals("")) {
						employeeFrame.displayErrorMessage("Error Occured. Please make sure that all fields are filled in.");
						return;
					}
					
					CRONUS_Sverige_AB_Employee tmpEmployee = new CRONUS_Sverige_AB_Employee();
					tmpEmployee.setNo_(No);
					tmpEmployee.setFirst_Name(FirstName);
					tmpEmployee.setLast_Name(LastName);
					tmpEmployee.setJob_Title(JobTitle);
					tmpEmployee.setAddress(Address);
					
					try {
						proxy.addEmployee(No, FirstName, LastName, JobTitle, Address);
						employeeFrame.getEmployeeTableModel().addEmployee(tmpEmployee);
						employeeFrame.clearTextFields();
					} catch (RemoteException e1) { // Kolla Error Handling!
						employeeFrame.displayErrorMessage("Error Occured. Please make sure that all fields are filled in and that No is unique.");
					}
				}
			});
			
			// btnDelete
			employeeFrame.getBtnDelete().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						int rowIndex = employeeFrame.getEmployeeTable().getSelectedRow();
						
						String No = employeeFrame.getEmployeeTableModel().getValueAt(rowIndex, 0).toString();
						proxy.deleteEmployee(No);
						
						employeeFrame.getEmployeeTableModel().removeEmployee(rowIndex);
					} catch (RemoteException e1) { 
						employeeFrame.displayErrorMessage("Error Occured."); 
					} catch (IndexOutOfBoundsException e2) {
						employeeFrame.displayErrorMessage("Error Occured. Please select a row in the table before deleting"); 
						
					}
					
				}
			});
			
			// btnUpdate
			employeeFrame.getBtnUpdate().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						String FirstName = employeeFrame.getTxtFieldFirstName().getText();
						String LastName = employeeFrame.getTxtFieldLastName().getText();
						String JobTitle = employeeFrame.getTxtFieldJobTitle().getText();
						String Address = employeeFrame.getTxtFieldAddress().getText(); 
						
						if (FirstName.equals("") || LastName.equals("") || JobTitle.equals("") || Address.equals("")) {
							employeeFrame.displayErrorMessage("Error Occured. Please make sure that all fields except No are filled in.");
							return;
						}
											
						int rowIndex = employeeFrame.getEmployeeTable().getSelectedRow();
						
						String No = employeeFrame.getEmployeeTableModel().getValueAt(rowIndex, 0).toString();
						proxy.updateEmployee(No, FirstName, LastName, JobTitle, Address);
						employeeFrame.clearTextFields(); 
					} catch (RemoteException e1) {						
						employeeFrame.displayErrorMessage("Error Occured."); 
					} catch (IndexOutOfBoundsException e2) {
						employeeFrame.displayErrorMessage("Error Occured. Please select a row before updating."); 
					}
	
				}
			});
			
			employeeFrame.getBtnFind().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					try {
						String No = employeeFrame.getTxtFieldNo().getText(); 
						CRONUS_Sverige_AB_Employee tmpEmployee = proxy.findEmployee(No); 
						employeeFrame.getTxtAreaFindEmployee().setText(
							"First Name: " + tmpEmployee.getFirst_Name() + "\n" +
							"Last Name: " + tmpEmployee.getLast_Name() + "\n" +
							"Job Title: " + tmpEmployee.getJob_Title() + "\n" +
							"Address: " + tmpEmployee.getAddress()
						);
						employeeFrame.clearTextFields(); 
						
					} catch (RemoteException e1) {
						employeeFrame.displayErrorMessage("Error Occured. Could not find an employee with the given No."); 
						
						
					}
					
					
				}
			}); 
		}
}
