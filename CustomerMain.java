package Activity1_classes_and_objects;

import java.util.Scanner;

class Customer{
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
}

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the details");
		String comaSep = scan.next();
		String[] details = comaSep.split(",");
		
		Customer cust = new Customer();
		
		cust.setAddress(details[1]);
		cust.setMobile(details[2]);
		cust.setName(details[0]);
		
		System.out.println("Name: "+cust.getName());
		System.out.println("Address: "+cust.getAddress());
		System.out.println("Mobile: "+cust.getMobile());
		
		

	}

}
