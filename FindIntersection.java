package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// array declaration
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		int[] array3 = new int[3];
		int k = 0;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					array3[k] = array1[i];
					// System.out.println("array3[" + k + "]" + array3[k]);
					k++;
					break;
				}
			}
		}
		for(int i=0;i<array3.length;i++) {
			System.out.print(","+array3[i]);
			
		}
		
	}
}
