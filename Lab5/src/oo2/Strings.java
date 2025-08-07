package oo2;

public class Strings {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("Ed Sheeran ");
		System.out.println(sb);

		sb.append(" Is the artist ever");
		System.out.println(sb);
		sb.toString();
		System.out.println(sb.toString());
		int index1 = sb.indexOf("artist");
		sb.insert(index1,"greatest ");
		System.out.println(sb);
		int index2 = sb.indexOf("artist");
		
			
			sb.replace(sb.indexOf("artist"), sb.indexOf("artist") + 6, "singer");
			System.out.println(sb.toString());
		
		String a = "Jamie";
		String uppername = a.toUpperCase();
		String lowername = a.toLowerCase();
		String startswith = "A";
		String endswith = "e";
		int index = a.indexOf('m');
		

		for (char c : a.toCharArray()) {

			System.out.println(c + "\n");

		}

		char c = a.charAt(2);
		System.out.println(c);
		System.out.println(uppername);
		System.out.println(lowername);

		if (a.startsWith(startswith)) {

			System.out.println("The string starts with" + startswith);
		} else {
			System.out.println("The string doesn't start with " + startswith);
		}

		if (a.endsWith(endswith)) {

			System.out.println("The string ends with " + endswith);
		} else {
			System.out.println("The string doesn't end with " + endswith);
		}

		System.out.println("Index of m is: " + index);

		System.out.println(a + " Airey");

	}

}
