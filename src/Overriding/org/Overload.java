package Overriding.org;

public class Overload {
	private void tester(String name) {
		System.out.println(name);
	}

	private void tester(int age) {
		System.out.println(age);

	}

	private void tester() {
		System.out.println("0123456789");

	}
	public static void main(String[] args) {
		Overload o=new Overload();
		o.tester("vishnu");
		o.tester(28);
		o.tester();
	}
}
