package Activity1_classes_and_objects;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

class Innings{
	private String teamname;
	private String inningsname;
	private int runs;
	
	public void setTeamName(String tn){
		this.teamname = tn;
	}
	
	public String getTeamName(){
		return teamname;
	}
	
	public void setInningsName(String in){
		this.inningsname = in;
	}
	
	public String getInningsName(){
		return inningsname;
	}
	
	public void setRuns(int r){
		this.runs = r;
	}
	
	public int getRuns(){
		return runs;
	}
	
	public void displayInningsDetails(){
		System.out.println("Name: "+ teamname);
		System.out.println("Score: " + runs);
		System.out.println("Need "+(runs+1) + " runs to win.");
	}
}

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the team name: ");
		String tn = scan.next();
		System.out.println("Enter Session: ");
		String in = scan.next();
		System.out.println("Enter runs: ");
		int r = scan.nextInt();
		Innings innings = new Innings();
		
		innings.setInningsName(in);
		innings.setTeamName(tn);
		innings.setRuns(r);
		
		innings.displayInningsDetails();

	}

}
