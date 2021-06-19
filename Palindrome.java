package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String str1 = "madam";
		String str2 = "";

		// method to print the string in reverse order
		char[] strRev = str1.toCharArray();
		for (int i = strRev.length - 1; i >= 0; i--) {
			str2 = str2 + strRev[i];
		}
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1.equals(str2)) {
			System.out.println("The given string is a polindrome");
		}
		else {
			System.out.println("The given string is not a polindrome");
		}
	}

}

/*
 * 
 * First method to print the string in reverse order
 * 
 * 
 * char[] strRevChar = new char[5];
 * 
 * System.out.println("String Length is: " + str.length());
 * 
 * for (int i = str.length() - 1; i >= 0; i--) { strRevChar[(str.length() - 1) -
 * i] = str.charAt(i); } String strRev = new String(strRevChar);
 * System.out.println(strRev);
 *
 *
 * 
 * 
 */