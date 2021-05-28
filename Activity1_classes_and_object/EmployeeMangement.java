package Activity1_classes_and_objects;

import java.util.Scanner;

class EmployeeDetails{
	private String name;
	private String address;
	private String mobile;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return mobile;
	}
	public void printDetails(){
		System.out.println("Employee Details: ");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Mobile: "+mobile);
	}
}

public class EmployeeMangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = scan.next();
		System.out.println("Enter Address: ");
		String address = scan.next();
		System.out.println("Enter mobile: ");
		String mobile = scan.next();
		EmployeeDetails emp = new EmployeeDetails();
		emp.setName(name);
		emp.setAddress(address);
		emp.setMobile(mobile);
		emp.printDetails();
		
		
		System.out.println("Menu");
		System.out.println("1. Update Employee name");
		System.out.println("2. Update Employee Address");
		System.out.println("3. Update Employee Mobile");
		System.out.println("4. All details are correct/ Exit");
		
		int menu = 0;
		while(menu != 4){
			menu = scan.nextInt();
			switch(menu){
		
		case 1:
			System.out.println("Current Name is: "+emp.getName());
			System.out.println("Enter new name: ");
			String newName = scan.next();
			emp.setName(newName);
			emp.printDetails();
			break;
		case 2:
			System.out.println("Current Address is: "+emp.getAddress());
			System.out.println("Enter new Address: ");
			String newAdd = scan.next();
			emp.setAddress(newAdd);
			emp.printDetails();
			break;
		case 3:
			System.out.println("Current mobile is: "+emp.getMobile());
			System.out.println("Enter new mobile:");
			String newmob = scan.next();
			emp.setMobile(newmob);
			emp.printDetails();
			break;
		case 4:
			emp.printDetails();
			break;
		default:
			break;
		}
	}}

}
