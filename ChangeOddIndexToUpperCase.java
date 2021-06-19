package week1.day2.assignments;

import java.lang.Character;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String str1 = "changeme";
		char[] strCharArray = str1.toCharArray();
		for (int i = 0; i < strCharArray.length; i++) {

			if (i % 2 == 0) {
				char[] caps = new char[7];
				caps[i] = Character.toUpperCase(strCharArray[i]);
				System.out.print(caps[i]);
			} else {
				System.out.print(strCharArray[i]);
			}
		}

	}

}
