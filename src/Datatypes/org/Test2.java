package Datatypes.org;

public class Test2 {
	byte a = 10;
	short b = 1234;
	long c = 123456789012l;
	String d = "vishnu";
	static int e = 5;
	float f = 123.456f;
	double g = 123456.789;
	char h = 's';
	static int v = 10;

	private void datatype() {

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.datatype();
		for (int i = 0; i <= e; i++) {
			System.out.println(i);
			for (int j = 0; j <= e; j++) {
				System.out.println(j);

			}

		}
		do {
			System.out.println(v);
			v++;
		} while (v <= 15);
	}
}
