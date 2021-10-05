package Variables.org;

public class Key_words {
	int a = 50;
	float b = 220.30f;
	static long c = 987456123321l;
	final short d = 1234;

	private void namee(String name) {
		System.out.println(name);

	}

	public static void address(String address) {
		System.out.println("Ramakrishna colony,pannavadi road,636303");
	}

	private final void mobileno(long mobileno) {
		System.out.println(mobileno);
		this.id();
	}

	private void id() {
		System.out.println("vishnuamsa@gmail.com");
		this.age(28);
	}

	private void age(int age) {
		System.out.println(age);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		Key_words k = new Key_words();
		k.namee("priya");
		k.mobileno(9874563222l);
					

	}
}
