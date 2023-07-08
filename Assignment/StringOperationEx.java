package Assignment;

public class StringOperationEx {

	public static void main(String[] args) {

		String s = "Syed";
		String s1 = "Syed";
		String s2 = "Saqeeb";
		String s3 = "How Are You";
		System.out.println("String in Upper Case: " + s.toUpperCase());
		System.out.println("String in Lower Case: " + s.toLowerCase());
		System.out.println("String is equals : " + s.equals(s2));
		System.out.println("String Ignores the case sensitivity: " + s.equalsIgnoreCase(s1));
		System.out.println("String Concate:" + s.concat(" " + s2));
		System.out.println("String length:" + s2.length());
		System.out.println("Combination of all the strings using concat : " + s.concat(s1).concat(s2));
		System.out.println("Index of S :" + s.indexOf("S"));
		System.out.println("Index of y :" + s.indexOf("y"));
		System.out.println("Index of last Index :" + s2.lastIndexOf("e"));
		System.out.println("Replace :" + s.replace("Syed", "Md"));
		System.out.println("Contains of :" + s.contains("s"));
		System.out.println("Substring  :" + s.substring(1, 3));
		System.out.println("Trim :" + s.trim());
		System.out.println("Trim :" + s3.trim());

		String str4 = "How are you Saqeeb?";
		String arrStr[] = str4.split(" ", 3);
		System.out.println("Splited Elements:");
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();
		System.out.println("Splited Elements using for each loop:");
		for (String str5 : arrStr) {
			System.out.println(str5 + " ");

		}
		String s7 = "";
		System.out.println("Is Empty?  :" + s7.isEmpty());
		System.out.println("Is Blank?  :" + s7.isBlank());
		System.out.println("Length of String s7  :" + s7.length());

		int a[] = { 1, 2, 3 };

		for (int b : a) {
			System.out.println(b);
		}

		String z = "    hi    !";
		// convert string into char array
		char[] z1 = z.toCharArray();
		System.out.println(z1);

		String k = "   Welcome to edubridge    ";

		// convert string into character array
		char[] k1 = k.toCharArray();
		String tempk = "";
		for (char c : k1) {

			if (c != ' ') {
				tempk += c;
			}
			// System.out.println(c);
			System.out.println("Temp" + tempk);
		}
		k = tempk;
		System.out.println(k);

		// String s11="sayed";

		StringBuffer s12 = new StringBuffer("sayed saqeeb");

		System.out.println("Length of String S12 :" + s12.length());
		System.out.println("Substring of String S12 :" + s12.substring(2));
		System.out.println("Index of String S12 :" + s12.indexOf("q"));
		System.out.println("is Equlal of String S12 :" + s12.equals(s12));
		System.out.println("Reverse of String S12 :" + s12.reverse());
		System.out.println("Is Equals of String S12 : " + s12.equals(s12));
		System.out.println("Append of String S12 : " + s12.appendCodePoint(20));
		System.out.println("Cpacity of String S12 :" + s12.capacity());
		System.out.println("Last Index of String S12 :" + s12.lastIndexOf("b"));
		System.out.println("Print of String S12 : " + s12);
		System.out.println("Reverse of of String S12 :" + s12.reverse());
		System.out.println("Print of String S12 :" + s12);

		StringBuilder s13 = new StringBuilder("Happy Home");

		System.out.println("Length of String S13 :" + s13.length());
		System.out.println("Is Emplty String S13 :" + s13.isEmpty());
		System.out.println("Append String S13 :" + s13.append(1));
		System.out.println("Append String S13 :" + s13.append(1));
		System.out.println("Char String S13 :" + s13.charAt(0));
		System.out.println("Print String S13 :" + s13);
		System.out.println(""+s13.insert(12, "  bb"));
		
		
	

	}

}
