import org.tempuri.CronusServiceSoap;
import org.tempuri.CronusServiceSoapProxy;

import java.rmi.RemoteException;

import org.tempuri.CRONUS_Sverige_AB_Employee; 

public class Application {

	public static void main(String[] args) {
		CronusServiceSoap proxy = new CronusServiceSoapProxy(); 
		
		try {
			CRONUS_Sverige_AB_Employee[] employees = proxy.getEmployees();
			
			for(CRONUS_Sverige_AB_Employee employee : employees)  {
				System.out.println(employee.getFirst_Name()); 
			
			}
				
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
