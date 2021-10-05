package Overloading.org;

public class Test1 {
	private void overloading(String name) {
		System.out.println(name);

	}

	private void overloading(int age) {
		System.out.println(age);

	}

	private void overloading(long mbleno) {
		System.out.println(mbleno);

	}

	private void overloading() {

		System.out.println("ramakrishna colony,pannavadi road,636303");
	}

	public static void main(String[] args) {
		Test1 o = new Test1();
		o.overloading("priya");
		o.overloading(28);
		o.overloading(9874563210l);
		o.overloading();
	}
}
