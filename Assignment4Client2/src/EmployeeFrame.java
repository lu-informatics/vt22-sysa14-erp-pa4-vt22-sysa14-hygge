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

public class EmployeeFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(77, 34, 393, 181);
		contentPane.add(scrollPane);
		
		table = new JTable();
	
		scrollPane.setViewportView(table);
		
		EmployeeTableModel empTableModel = new EmployeeTableModel(); 
		
		CRONUS_Sverige_AB_Employee emp1 = new CRONUS_Sverige_AB_Employee();
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
		empTableModel.addEmployee(emp2);
		
		table.setModel(empTableModel);
		
	}
}
