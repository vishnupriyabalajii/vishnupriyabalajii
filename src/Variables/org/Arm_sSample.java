package Variables.org;

public class Arm_sSample {
	public static void main(String[] arg) {
		int i = 100, a, b, c = 0;
		System.out.println("Armstrong numbers between 100 to 500 ");
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
