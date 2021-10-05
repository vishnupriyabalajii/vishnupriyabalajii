package Variables.org;

public class Condition_state {
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		for (int i = 0; i <= 5; i++) {
			System.out.println("java");
			for (int j = 0; j <=i; j++) {
				System.out.println(j);
			}
		}
		while (b <=40) {
			System.out.println(b);
			b++;
		}
		do {
			System.out.println(a);
			a++;
		} while (a <= 20);
		
	}
}
