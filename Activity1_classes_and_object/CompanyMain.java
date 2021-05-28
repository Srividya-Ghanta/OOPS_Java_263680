package Activity1_classes_and_objects;

import java.util.Scanner;

class Company{
	private String name;
	private String employees;
	private String teamlead;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setEmployess(String employees){
		this.employees = employees;
	}
	public String[] getEmployees(){
		return employees.split(",");
	}
	public void setTeamLead(String teamlead){
		this.teamlead = teamlead;
	}
	public String getTeamLead(){
		return teamlead;
	}
	public void printDetails(){
		int flag = 0;
		String[] list = employees.split(",");
		for(int i = 0; i < list.length; i++){
			if (teamlead.equals(list[i])){
				System.out.println("in this");
				flag = 1;
				break;
			}
		}
		if (flag == 1){
			System.out.println("name: "+name);
			System.out.println("Employees: "+employees);
			System.out.println("Lead: "+teamlead);
		} else {
			System.out.println("Invalid Input");
		}
	}
}

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the company name: ");
		String name = scan.nextLine();
		System.out.println("Enter the employees: ");
		String employees = scan.next();
		System.out.println("Enter Team Lead: ");
		String teamlead = scan.next();
		
		Company company = new Company();
		company.setEmployess(employees);
		company.setName(name);
		company.setTeamLead(teamlead);
		//System.out.println(company.getTeamLead());
		company.printDetails();
		

	}

}
