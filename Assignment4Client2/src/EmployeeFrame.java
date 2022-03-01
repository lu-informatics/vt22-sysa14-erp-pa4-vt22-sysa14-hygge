import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.tempuri.CRONUS_Sverige_AB_Employee;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class EmployeeFrame extends JFrame {
	private JTextField txtFieldNo;
	private JTextField txtFieldFirstName;
	private JTextField txtFieldLastName;
	private JTextField txtFieldJobTitle;
	private JTextField txtFieldAddress;
	private JButton btnCreate; 
	private JButton btnFind; 
	private JButton btnUpdate; 
	private JButton btnDelete; 
	private JTable employeeTable;
	private EmployeeTableModel employeeTableModel;
	private JScrollPane scrollPane;
	private JTextArea txtAreaFindEmployee; 

	/**
	 * Create the frame.
	 */
	public EmployeeFrame() {											//Bakgrund
		getContentPane().setBackground(new Color(173, 216, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 526);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblNo = new JLabel("No:");								//Lable no
		lblNo.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNo.setBounds(20, 79, 91, 14);
		getContentPane().add(lblNo);
		
		JLabel lblFirstName = new JLabel("First Name:");				//Lable First Name
		lblFirstName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblFirstName.setBounds(20, 122, 91, 14);
		getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");					//Lable Last Name
		lblLastName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblLastName.setBounds(20, 162, 91, 14);
		getContentPane().add(lblLastName);
		
		JLabel lblJobTitle = new JLabel("Job Title:");					//Lable Job Title
		lblJobTitle.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblJobTitle.setBounds(20, 201, 91, 14);
		getContentPane().add(lblJobTitle);
		
		JLabel lblAddress = new JLabel("Address:");						//Lable Address
		lblAddress.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAddress.setBounds(20, 236, 91, 14);
		getContentPane().add(lblAddress);
		
		txtFieldNo = new JTextField();									//txtfield No
		txtFieldNo.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtFieldNo.setBounds(109, 78, 129, 20);
		getContentPane().add(txtFieldNo);
		txtFieldNo.setColumns(10);
		
		txtFieldFirstName = new JTextField();								//txtfield first name
		txtFieldFirstName.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtFieldFirstName.setColumns(10);
		txtFieldFirstName.setBounds(109, 120, 129, 20);
		getContentPane().add(txtFieldFirstName);
		
		txtFieldLastName = new JTextField();								//txtfield last name
		txtFieldLastName.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtFieldLastName.setColumns(10);
		txtFieldLastName.setBounds(109, 161, 129, 20);
		getContentPane().add(txtFieldLastName);
		
		txtFieldJobTitle = new JTextField();								//txtfield job title
		txtFieldJobTitle.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtFieldJobTitle.setColumns(10);
		txtFieldJobTitle.setBounds(109, 200, 129, 20);
		getContentPane().add(txtFieldJobTitle);
		
		txtFieldAddress = new JTextField();									//txtfield address
		txtFieldAddress.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtFieldAddress.setColumns(10);
		txtFieldAddress.setBounds(109, 235, 129, 20);
		getContentPane().add(txtFieldAddress);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(275, 79, 524, 176);
		getContentPane().add(scrollPane);
		
		employeeTable = new JTable();												//JTABLE
		employeeTable.setBackground(new Color(240, 248, 255));
		scrollPane.setViewportView(employeeTable);
		employeeTable.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		btnCreate = new JButton("Create");						//btb Create
		btnCreate.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnCreate.setBounds(20, 298, 89, 23);
		btnCreate.setToolTipText("Enter values for No, First Name, Last Name, Job Title and Address and then press this button to add a record of a new employee.");
		getContentPane().add(btnCreate);
		
		btnFind = new JButton("Find");							//btb Read
		btnFind.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnFind.setBounds(147, 342, 91, 23);
		btnFind.setToolTipText("Enter a No in the No field to retrieve information about an employee.");
		getContentPane().add(btnFind);
		
		btnUpdate = new JButton("Update");						//btb Update
		btnUpdate.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnUpdate.setBounds(149, 298, 89, 23);
		btnUpdate.setToolTipText("Select a row and enter fields to be updated.");
		getContentPane().add(btnUpdate);
		
		btnDelete = new JButton("Delete");						//btb Delete
		btnDelete.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnDelete.setBounds(20, 342, 89, 23); 
		btnDelete.setToolTipText("Select a row to be deleted.");
		getContentPane().add(btnDelete);
		
		employeeTableModel = new EmployeeTableModel(); 
		employeeTable.setModel(employeeTableModel);
		
		txtAreaFindEmployee = new JTextArea();
		txtAreaFindEmployee.setEditable(false);
		txtAreaFindEmployee.setBounds(275, 300, 524, 111); 
		txtAreaFindEmployee.setBackground(new Color(240, 240, 240));
		getContentPane().add(txtAreaFindEmployee);
		
		this.setVisible(true);	
	}
	
	public void clearTextFields() {
		txtFieldNo.setText("");
		txtFieldFirstName.setText("");
		txtFieldLastName.setText("");
		txtFieldJobTitle.setText("");
		txtFieldAddress.setText("");
	}
	
	public void displayErrorMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
	
	public JTextField getTxtFieldNo() {
		return txtFieldNo;
	}

	public JTextField getTxtFieldFirstName() {
		return txtFieldFirstName;
	}

	public JTextField getTxtFieldLastName() {
		return txtFieldLastName;
	}

	public JTextField getTxtFieldJobTitle() {
		return txtFieldJobTitle;
	}

	public JTextField getTxtFieldAddress() {
		return txtFieldAddress;
	}

	public JButton getBtnCreate() {
		return btnCreate;
	}

	public JButton getBtnFind() {
		return btnFind;
	}

	public JButton getBtnUpdate() {
		return btnUpdate;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public JTable getEmployeeTable() {
		return employeeTable;
	}
	
	public EmployeeTableModel getEmployeeTableModel() {
		return employeeTableModel;
	}

	public JTextArea getTxtAreaFindEmployee() {
		return txtAreaFindEmployee;
	}
	
}
