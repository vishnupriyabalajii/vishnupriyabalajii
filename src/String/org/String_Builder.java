package String.org;

public class String_Builder {
	public static void main(String[] args) {
		System.out.println("***Using String Buffer and String Builder***");
		StringBuilder sb = new StringBuilder("String Program ");
		System.out.println("Original Value Before Modification:" + sb);
		StringBuffer sb1 = new StringBuffer("String Program ");
		System.out.println("Original value Before Modification:" + sb1);
		sb.append("Using ");
		System.out.println("Original Value After Modification:" + sb);
		sb.insert(21, "the");
		System.out.println("Original Value After MOdification:" + sb);
		sb.replace(21, 24, "String Builder ");
		System.out.println("Original value After MOdification:" + sb);
		sb.delete(0, 14);
		System.out.println("Original value After Modification:" + sb);
		sb.reverse();
		System.out.println("Original Value After Modification:" + sb);
		sb.reverse();
		System.out.println("Original Value After Modification:" + sb);
		int capacity = sb.capacity();
		System.out.println("The Capacity is:" + capacity);
		int length = sb.length();
		System.out.println("The Length is:" + length);
		String substring = sb.substring(8);
		System.out.println("substring is:" + substring);
		char charAt = sb.charAt(3);
		System.out.println("Char is:" + charAt);
		sb.append("Program Using There String Types In String Builder");
		System.out.println("Original Value After Modification:" + sb);
		int length3 = sb.length();
		System.out.println("The Length is:" + length3);
		int capacity3 = sb.capacity();
		System.out.println("The Capacity is:" + capacity3);
		sb1.append("using ");
		System.out.println("Original Value After Modification:" + sb1);
		sb1.replace(0, 20, "String Buffer");
		System.out.println("Original Value After Modification:" + sb1);
		String substring2 = sb1.substring(7);
		System.out.println("substring2 is:" + substring2);
		int capacity2 = sb1.capacity();
		System.out.println("The Capacity2 is:" + capacity2);
		int length2 = sb1.length();
		System.out.println("The Length is:" + length2);
		sb1.reverse();
		System.out.println("Original Value After Modification:" + sb1);
		sb1.reverse();
		System.out.println("Original Value After Modification:" + sb1);
		sb1.insert(0, "String Types Using ");
		System.out.println("Original Value After MOdification:" + sb1);
		String substring3 = sb1.substring(8, 15);
		System.out.println("substring3 is:" + substring3);

	}
}
