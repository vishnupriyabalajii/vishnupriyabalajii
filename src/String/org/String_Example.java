package String.org;

public class String_Example {
	public static void main(String[] args) {

		System.out.println("String Function");
		String str = new String("Welcome to Greens");
		int length = str.length();
		boolean equals = str.equals("Welcome to Greens");
		boolean equalsignore = str.equalsIgnoreCase("welcome to greens");
		String upperCase = str.toUpperCase();
		String LowerCase = str.toLowerCase();
		boolean Startswith = str.startsWith("Welcome");
		boolean endswith = str.endsWith("Greens");
		int indexof = str.indexOf('W');
		int lastindexof = str.lastIndexOf('e');
		char charAt = str.charAt(3);
		String replace = str.replace("to", "for");
		boolean contains = str.contains("Greens");
		String SubString = str.substring(3);
		String SubString2 = str.substring(3, 10);
		boolean empty = str.isEmpty();
		String trim = str.trim();
		System.out.println("The orignal string is:" + str);
		System.out.println("length is:" + length);
		System.out.println("equals is:" + equals);
		System.out.println("equalsignore is:" + equalsignore);
		System.out.println("uppercase is:" + upperCase);
		System.out.println("lowercase is:" + LowerCase);
		System.out.println("startswith is:" + Startswith);
		System.out.println("endswith is:" + endswith);
		System.out.println("indexof is:" + indexof);
		System.out.println("lastindexof is:" + lastindexof);
		System.out.println("charAt is:" + charAt);
		System.out.println("replace is:" + replace);
		System.out.println("contains is:" + contains);
		System.out.println("substring is:" + SubString);
		System.out.println("SubString is:" + SubString2);
		System.out.println("empty is:" + empty);
		System.out.println("trim is:" + trim);
		String[] split = str.split(" ");
		for (String w : split) {
			System.out.print(w);
		}

	}
}