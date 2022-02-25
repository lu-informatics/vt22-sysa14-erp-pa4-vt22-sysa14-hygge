import java.rmi.RemoteException;

import org.tempuri.CRONUS_Sverige_AB_Employee;
import org.tempuri.CronusServiceSoap;
import org.tempuri.CronusServiceSoapProxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CronusServiceSoap proxy = new CronusServiceSoapProxy(); 
		
		try {
			CRONUS_Sverige_AB_Employee[] employees = proxy.getEmployees();
			
			for(CRONUS_Sverige_AB_Employee employee : employees) {
				System.out.println(employee.getFirst_Name()); 
				
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		} 

	}

}
