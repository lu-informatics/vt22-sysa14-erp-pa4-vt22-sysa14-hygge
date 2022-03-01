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

public class EmployeeFrame extends JFrame {

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
	public EmployeeFrame() {
		getContentPane().setBackground(new Color(176, 196, 222));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 526);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("No:");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel.setBounds(20, 79, 91, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblFirstName.setBounds(20, 105, 91, 14);
		getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblLastName.setBounds(20, 128, 91, 14);
		getContentPane().add(lblLastName);
		
		JLabel lblJobTitle = new JLabel("Job Title:");
		lblJobTitle.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblJobTitle.setBounds(20, 153, 91, 14);
		getContentPane().add(lblJobTitle);
		
		JLabel lblNewLabel_3_1 = new JLabel("Address:");
		lblNewLabel_3_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(20, 178, 91, 14);
		getContentPane().add(lblNewLabel_3_1);
		
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
