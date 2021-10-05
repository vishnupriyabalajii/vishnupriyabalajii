package Variables.org;

public class Constrouctrrr {
	public Constrouctrrr() {
		System.out.println("priya");
	}

	public Constrouctrrr(int age) {
		System.out.println(age);
	}

	public Constrouctrrr(long mobileno) {
		System.out.println(mobileno);
	}

	public Constrouctrrr(String address) {
		System.out.println(address);
	}

	public static void main(String[] args) throws Throwable {
		Constrouctrrr a = new Constrouctrrr();
		Constrouctrrr a1=new Constrouctrrr(28);
		Constrouctrrr b=new Constrouctrrr(8610008656l);
		Constrouctrrr b1=new Constrouctrrr("ramakrishna colony,pannavadi road,636303");
		a.finalize();
		a1.finalize();
		b.finalize();
		b1.finalize();
	}
}
