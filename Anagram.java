package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {
	
	public void anagram() {
		
		// Declaring strings
		String string1 = "stops";
		String string2 = "potss";

		int string1Length = string1.length();
		int string2Length = string2.length();

		// length of the strings should be same for Anagram
		if (string1Length == string2Length) {
			// Converting string1 into characterArray
			char[] charactersOfString1 = string1.toCharArray();

			// Converting string2 into characterArray
			char[] charactersOfString2 = new char[5];
			for (int i = 0; i < string2.length(); i++) {
				charactersOfString2[i] = string2.charAt(i);
			}

			// Sorting Both the arrays
			Arrays.sort(charactersOfString1);
			Arrays.sort(charactersOfString2);

			// Checking both the arrays has same value

			if (Arrays.equals(charactersOfString1, charactersOfString2)) {
				System.out.println("The given words are Anagram");
			} else {
				System.out.println("The given words are not Anagram");
			}
		} else {
			System.out.println("Words should be in same length for Anagram");
		}

	}

	public static void main(String[] args) {
		Anagram angram=new Anagram();
		angram.anagram();

	}
}
