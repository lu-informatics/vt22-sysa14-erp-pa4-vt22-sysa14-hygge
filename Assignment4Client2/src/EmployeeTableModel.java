import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import org.tempuri.CRONUS_Sverige_AB_Employee;

public class EmployeeTableModel extends AbstractTableModel {
	private ArrayList<CRONUS_Sverige_AB_Employee> employees = new ArrayList<CRONUS_Sverige_AB_Employee>(); 
	private String[] columns = { "No", "First Name", "Last Name", "Job Title", "Address" }; //Column names for the users
	
	public void addEmployee(CRONUS_Sverige_AB_Employee employee) 
	{
		employees.add(employee); 
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return employees.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columns.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
