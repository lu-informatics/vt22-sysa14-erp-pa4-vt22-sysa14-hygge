import java.rmi.RemoteException;

import org.tempuri.CRONUS_Sverige_AB_Employee;
import org.tempuri.CronusServiceSoap;
import org.tempuri.CronusServiceSoapProxy;

public class Main {

	public static void main(String[] args) {
		
		CronusServiceSoap proxy = new CronusServiceSoapProxy(); 
		
		try {
			CRONUS_Sverige_AB_Employee[] employees = proxy.getEmployees();
			
			for(CRONUS_Sverige_AB_Employee employee : employees) {
				System.out.println(employee.getNo_()); 
				
			}
			
		} catch (RemoteException e) {			
			e.printStackTrace();
		}   
	}

}
