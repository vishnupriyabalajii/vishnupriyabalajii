package Variables.org;

public class Method {
	int age = 25;
	float a = 253.093f;
	long b = 123456789012345678l;

	private void tester(String name) {
		System.out.println(name);
	}

	private void tester(int age) {
		System.out.println(age);
	}

	private void tester() {
		System.out.println("012345678");
		System.out.println(age);
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Method m = new Method();
		m.tester("neymar");
		m.tester(28);
		m.tester();

	}
}
