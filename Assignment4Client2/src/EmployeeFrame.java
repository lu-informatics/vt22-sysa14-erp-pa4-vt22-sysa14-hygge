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
import javax.swing.JTextField;

public class EmployeeFrame extends JFrame {
	private JTextField txtFieldNo;
	private JTextField txtFieldFirstName;
	private JTextField ttxtFieldLastName;
	private JTextField txtFieldJobTitle;
	private JTextField txtFieldAddress;
	private JTable JTable;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeFrame frame = new EmployeeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeFrame() {											//Bakgrund
		getContentPane().setBackground(new Color(173, 216, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 526);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblNo = new JLabel("No:");								//Lable no
		lblNo.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNo.setBounds(20, 79, 91, 14);
		getContentPane().add(lblNo);
		
		JLabel lblFirstName = new JLabel("First Name:");				//Lable First Name
		lblFirstName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblFirstName.setBounds(20, 126, 91, 14);
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
		
		ttxtFieldLastName = new JTextField();								//txtfield last name
		ttxtFieldLastName.setFont(new Font("Verdana", Font.PLAIN, 12));
		ttxtFieldLastName.setColumns(10);
		ttxtFieldLastName.setBounds(109, 161, 129, 20);
		getContentPane().add(ttxtFieldLastName);
		
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
		scrollPane.setBounds(266, 79, 366, 397);
		getContentPane().add(scrollPane);
		
		JTable = new JTable();												//JTABLE
		JTable.setBackground(new Color(240, 248, 255));
		scrollPane.setViewportView(JTable);
		JTable.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnCreate = new JButton("Create");						//btb Create
		btnCreate.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnCreate.setBounds(22, 304, 89, 23);
		getContentPane().add(btnCreate);
		
		JButton btnRead = new JButton("Read");							//btb Read
		btnRead.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnRead.setBounds(149, 304, 89, 23);
		getContentPane().add(btnRead);
		
		JButton btbUpdate = new JButton("Update");						//btb Update
		btbUpdate.setFont(new Font("Verdana", Font.PLAIN, 12));
		btbUpdate.setBounds(22, 355, 89, 23);
		getContentPane().add(btbUpdate);
		
		JButton btbDelete = new JButton("Delete");						//btb Delete
		btbDelete.setFont(new Font("Verdana", Font.PLAIN, 12));
		btbDelete.setBounds(149, 355, 89, 23); 
		getContentPane().add(btbDelete);
		
		EmployeeTableModel empTableModel = new EmployeeTableModel(); 
		
		/*CRONUS_Sverige_AB_Employee emp1 = new CRONUS_Sverige_AB_Employee();
		emp1.setNo_("KE");
		emp1.setFirst_Name("Karin");
		emp1.setLast_Name("Engdal");
		emp1.setAddress("Hejgatan 1");
		emp1.setJob_Title("Programmerare");
		empTableModel.addEmployee(emp1);
		
		CRONUS_Sverige_AB_Employee emp2 = new CRONUS_Sverige_AB_Employee();
		emp2.setNo_("HT");
		emp2.setFirst_Name("Hannes");
		emp2.setLast_Name("Thunström");
		emp2.setAddress("Hallågatan 2");
		emp2.setJob_Title("Städare");
		empTableModel.addEmployee(emp2);*/
		
	}
}
