package Variables.org;

import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {

		int b = 0, c = 0;
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("a");
		a = s.nextInt();
		int d = a;
		while (a > 0) {
			b = a % 10;
			c = c + (b * b * b);
			a = a / 10;
		}
		System.out.println(c);
		if (c == d) {
			System.out.println("three digits armstrong number");
		} else {
			System.out.println("there is no armstrong number");
		}
	}
}
