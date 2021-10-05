package Variables.org;

public class If_Elsee {
	public static void main(String[] args) {
		int grade = 80;
		if (grade >= 91 && grade <= 100) {
			System.out.println("S grade");

		} else if (grade >= 81 && grade <= 90) {
			System.out.println("A grade");

		} else if (grade >= 71 && grade <= 80) {
			System.out.println("B grade");

		} else {
			System.out.println("U grade");
		}
	}
}
