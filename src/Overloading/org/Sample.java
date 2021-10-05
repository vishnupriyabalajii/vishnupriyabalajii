package Overloading.org;

public class Sample extends Details {
	public void tester(String name) {
		System.out.println(name);
	}

	public void tester(int age) {
		System.out.println(age);

	}

	public static void main(String[] args) {
		Sample s=new Sample();
		s.tester("vishnu");
		s.tester(28);
		s.tester();
	}
}


	
