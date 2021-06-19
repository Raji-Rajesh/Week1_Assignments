package week1.day2.assignments;

import java.lang.Character;

public class FindTypes {

	public static void main(String[] args) {
		String test="$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] testChar=test.toCharArray();
		for(int i=0;i<testChar.length;i++) {
			if(Character.isLetter(testChar[i])) {
				letter++;
			}
			else if(Character.isSpaceChar(testChar[i])) {
				space++;
			}
			else if(Character.isDigit(testChar[i])) {
				num++;
			}
			else
			{
				specialChar++;
			}
		}
		System.out.println("No of letters used: "+letter);
		System.out.println("No of space used: "+space);
		System.out.println("No of numbers used: "+num);
		System.out.println("No of specialcharacters used: "+specialChar);
	}
}
