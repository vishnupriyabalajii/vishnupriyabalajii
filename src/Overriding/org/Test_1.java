package Overriding.org;

public class Test_1 extends Test1 {
	@Override
	public void overloading(String name) {

		super.overloading(name);
	}

	@Override
	public void overloading(int age) {

		super.overloading(age);
	}

	public static void main(String[] args) {
		Test_1 t = new Test_1();
		t.overloading("priya");
		t.overloading(28);
		t.overloading();
	}
}
