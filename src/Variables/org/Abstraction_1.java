package Variables.org;

public class Abstraction_1 extends Abstraction {
@Override
public void age() {
	System.out.println("18");
	
}
public static void id() {
	System.out.println("123456");

}
public static void main(String[] args) {
	Abstraction_1 a=new Abstraction_1();
	a.age();
	a.namee();
	id();
}
}
