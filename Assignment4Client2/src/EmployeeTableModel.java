import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import org.tempuri.CRONUS_Sverige_AB_Employee;

public class EmployeeTableModel extends AbstractTableModel {
	private ArrayList<CRONUS_Sverige_AB_Employee> employees = new ArrayList<CRONUS_Sverige_AB_Employee>();  //An array containing all the employess at Cronus
	private String[] columns = { "No", "First Name", "Last Name", "Job Title", "Address" }; //Column names for the users
	
	public void addEmployee(CRONUS_Sverige_AB_Employee employee) { 		 
		employees.add(employee); 
		this.fireTableDataChanged(); 		//addEmployee, Add for Table Model, "fire".When this happens, the JTable will update
	}
	
	public void removeEmployee(int rowIndex) {		
		employees.remove(rowIndex);
		this.fireTableDataChanged(); 			//removeEmployee, Remove a row (employee) in Table Model
	}
	
	@Override
	public int getRowCount() {			//GetRowCount, and depend on how many employee there is, the size will vary
		return employees.size();
	}

	@Override
	public int getColumnCount() {		//GetColumnsCount, and depend on how many "categories" there is, the length will vary
		return columns.length; 
	}
	
	@Override
	public String getColumnName(int columnIndex) {		//ColumnName, get column name [0] will retrieve No for example
		return columns[columnIndex];  
		
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {				//Object because we do an override method from AbstractTableModel
		CRONUS_Sverige_AB_Employee tmpEmployee = employees.get(rowIndex); 	//Return the value for one place in the Table, example [0]
		
		switch(columnIndex)  {
		case 0: return tmpEmployee.getNo_(); 			//Index 0 will return No
		case 1: return tmpEmployee.getFirst_Name(); 
		case 2: return tmpEmployee.getLast_Name(); 
		case 3: return tmpEmployee.getJob_Title();
		case 4: return tmpEmployee.getAddress(); 
		
		}
		
		return null;  
	}

}
