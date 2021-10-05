package Variables.org;

public class Var {
	static int a = 52;
	static String b = "vishnu";
	float c = 10.23f;

	private static void variable() {

		System.out.println(a);
	}

	private static void namee() {

		System.out.println("vishnu");
	}
	private void fvalue() {
		System.out.println(c);

	}

	public static void main(String[] args) {
		Var v=new Var();
		variable();
		namee();
		v.fvalue();
	}
}
