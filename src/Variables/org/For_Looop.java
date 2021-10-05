package Variables.org;

public class For_Looop {
	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			System.out.println("Nested for loop");
			for (int j = 0; j <= i; j++) {
				System.out.println(j);
			}
		}
	}
}
