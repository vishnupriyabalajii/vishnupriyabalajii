package Datatypes.org;

public class Types extends Data {
	public void data(String name) {
		System.out.println(name);
		this.data(25);
	}

	public void data(int age) {
		System.out.println(age);

	}

	public static void main(String[] args) {
		Types d = new Types();
		d.data("rathi");
		d.data();
	}

}
