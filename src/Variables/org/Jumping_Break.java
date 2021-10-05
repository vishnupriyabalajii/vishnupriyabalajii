package Variables.org;

import java.util.Random;

public class Jumping_Break {

	public static void main(String[] args) {
		String name = "";
		Random r = new Random();
		Boolean male = r.nextBoolean();
		for (int i = 0; i < 10; i++) {
			if (i == 5) {

				continue;
			}
			System.out.println(i);
		}
		if (male==true) {
			name="bala";
		}
		if (male==false) {
			name="priya";
		}
		System.out.format("we will use name:%s%n",name);
		System.out.println(9>8);

	}

}
