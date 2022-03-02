
public class Main {

	public static void main(String[] args) {
		EmployeeFrame employeeFrame = new EmployeeFrame();			//Create an EmployeeFrame object. Since all the code is already in the constructor 
																	//.. this will be enough to start the GUI
		Controller controller = new Controller(employeeFrame);		//Create a controller to initialize the actionListeners
	}

}
