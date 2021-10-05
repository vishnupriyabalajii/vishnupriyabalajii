package Variables.org;

public class Arm_Strong {
	public static void main(String[] args) {
		int i = 100, a = 0, b, c;
		System.out.println("Armstrong number between 100 to 500");
		while (i < 500) {
			c = i;
			b = 0;
			while (c > 0) {
				a = c % 10;
				b = b + (a * a * a);
				c = c / 10;
			}
			if (b == i)
				System.out.println(i);
			i++;
		}
	}

}
