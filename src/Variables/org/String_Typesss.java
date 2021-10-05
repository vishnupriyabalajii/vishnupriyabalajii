package Variables.org;

public class String_Typesss {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("welcome");
		StringBuffer s1 = new StringBuffer("welcome");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		String s2 = "java";
		String s3 = "java";
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println("append");
		s1 = s1.append(s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println("concordination");
		s2 = s3 + s2;
		System.out.println(System.identityHashCode(s2));

	}
}
