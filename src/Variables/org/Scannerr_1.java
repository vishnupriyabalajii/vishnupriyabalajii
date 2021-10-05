package Variables.org;

import java.util.Scanner;

public class Scannerr_1 {
	private void atmprocess() {
		Scanner a = new Scanner(System.in);
		String insert;
		System.out.println("insert the atm card");
		insert = a.next();
		String language;
		System.out.println("select the language");
		language = a.next();
		int pin;
		System.out.println("enter the 4digits pin ");
		pin = a.nextInt();

	}

	public static void main(String[] args) {
		Scannerr_1 a = new Scannerr_1();
		a.atmprocess();
		Scanner b = new Scanner(System.in);
		String transaction;
		System.out.println("select the transactions");
		transaction = b.next();
		String account;
		System.out.println("select your account");
		account = b.next();
		int withdraw;
		System.out.println("enter the withdrawal money");
		withdraw = b.nextInt();
		String collect;
		System.out.println("collect the cash");

	}

}
