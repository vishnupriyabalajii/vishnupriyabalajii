package Variables.org;

import java.util.Scanner;

public class Palindromeee {
	public static void main(String[] args) {
		int b = 0, c = 0;
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("a");
		a = s.nextInt();
		int d=a;
		while (a > 0) {
			b = a % 10;
			c = (c * 10) + b;
			a = a / 10;
		}
		System.out.println(c);
		if (c== d) {
			System.out.println("it is palindrome");

		} else {
			System.out.println("it is not palindrome");
		}
	}
}
