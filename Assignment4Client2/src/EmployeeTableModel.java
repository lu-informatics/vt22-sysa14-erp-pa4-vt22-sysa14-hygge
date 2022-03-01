import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import org.tempuri.CRONUS_Sverige_AB_Employee;

public class EmployeeTableModel extends AbstractTableModel {
	private ArrayList<CRONUS_Sverige_AB_Employee> employees = new ArrayList<CRONUS_Sverige_AB_Employee>(); 
	private String[] columns = { "No", "First Name", "Last Name", "Job Title", "Address" }; //Column names for the users
	
	public void addEmployee(CRONUS_Sverige_AB_Employee employee) {
		employees.add(employee); 
		this.fireTableDataChanged(); 
	}
	
	public void removeEmployee(int rowIndex) {
		employees.remove(rowIndex);
		this.fireTableDataChanged(); 
	}
	
	@Override
	public int getRowCount() {
		return employees.size();
	}

	@Override
	public int getColumnCount() {
		return columns.length; 
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return columns[columnIndex];  
		
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		CRONUS_Sverige_AB_Employee tmpEmployee = employees.get(rowIndex); 
		
		switch(columnIndex)  {
		case 0: return tmpEmployee.getNo_(); 
		case 1: return tmpEmployee.getFirst_Name(); 
		case 2: return tmpEmployee.getLast_Name(); 
		case 3: return tmpEmployee.getJob_Title();
		case 4: return tmpEmployee.getAddress(); 
		
		}
		
		return null;  
	}
	public void setValueAt(Object val, int rowIndex, int columnIndex) {
		CRONUS_Sverige_AB_Employee tmpEmployee = employees.get(rowIndex);  
		
		if(columnIndex == 1) {
			String newFirstName = val.toString();
			tmpEmployee.setFirst_Name(newFirstName);
	
		} else if(columnIndex == 2) {
			String newLastName = val.toString();
			tmpEmployee.setLast_Name(newLastName);
		}
		else if(columnIndex == 3) {
			String newJobTitle = val.toString();
			tmpEmployee.setJob_Title(newJobTitle); 
		} 
		else if(columnIndex == 4) {
			String newAddress = val.toString();
			tmpEmployee.setAddress(newAddress);
		}
	}
}
