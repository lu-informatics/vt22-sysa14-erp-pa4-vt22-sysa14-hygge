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
	
	public CRONUS_Sverige_AB_Employee removeEmployee(int rowIndex) { // Method to remove employee from TableModel. Return the removed employee
		CRONUS_Sverige_AB_Employee tmpEmployee = employees.get(rowIndex);
		employees.remove(rowIndex);
		this.fireTableDataChanged(); 			//removeEmployee, Remove a row (employee) in Table Model
		return tmpEmployee;
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
				//Uses together the update method
	@Override 	//Method to change value of a cell at a certain position in the tableModel [0]
	public void setValueAt(Object val, int rowIndex, int columnIndex) {		
		CRONUS_Sverige_AB_Employee tmpEmployee = employees.get(rowIndex);  //Get employee in the specified row
		
		if(columnIndex == 1) {							//Changes the value of the specified employee and specified column 
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
		this.fireTableDataChanged();
	}
}
