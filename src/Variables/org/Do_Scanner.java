package Variables.org;

import java.util.Scanner;

public class Do_Scanner {

	public static void main(String[] args) {
		String name;
		int a=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter name: ");
			name = sc.next();
			a++;
		} while (a <= 5);
		System.out.println("a="+a);
		sc.close();

	}
}
