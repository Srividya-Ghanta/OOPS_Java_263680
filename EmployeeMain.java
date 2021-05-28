package Activity1_classes_and_objects;

import java.util.Scanner;

class Employee{
	private String name;
	private String address;
	private String mobile;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String add){
		this.address = add;
	}
	public String getAddress(){
		return address;
	}
	public void setMobile(String mob){
		this.mobile = mob;
	}
	public String getMobile(){
		return mobile;
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name");
		String n = scan.next();
		System.out.println("Enter Address");
		String a = scan.next();
		System.out.println("Enter Mobile");
		String m = scan.next();
		Employee emp = new Employee();
		emp.setName(n);
		emp.setAddress(a);
		emp.setMobile(m);
		System.out.println("Enployee Details");
		System.out.println("Name: " + emp.getName());
		System.out.println("Address: " + emp.getAddress());
		System.out.println("Mobile: " + emp.getMobile());
	}

}
