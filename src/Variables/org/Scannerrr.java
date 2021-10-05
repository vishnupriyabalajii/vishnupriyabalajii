package Variables.org;

import java.util.Scanner;

public class Scannerrr {
	private void atmprocess() {
		Scanner e=new Scanner(System.in);
		System.out.println("ATM WITHDRAWAL PROCESS");

	}

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Scannerrr e=new Scannerrr();
	e.atmprocess();
	System.out.println("Enter the ATM card");
	String next=s.next();
	System.out.println("Select the Language");
	String next1=s.next();
	System.out.println("Enter the 4 digits ATM pin");
	int nextInt=s.nextInt();
	System.out.println("Select your Transcation");
	String next2=s.next();
	System.out.println("Select your Account");
	String next3=s.next();
	System.out.println("Enter the withdrawal money");
	int nextInt1=s.nextInt();
	System.out.println("Collect the cash");
	
	
	
}
}
