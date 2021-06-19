package week1.day2.assignments;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int i;
		
		for (int positionPlace = 1; positionPlace < arr.length+2; positionPlace++) {
			//System.out.println("PositionPlace: "+positionPlace);
			for (i = 0; i < arr.length; i++) {
				//System.out.println("arr["+i+"]"+arr[i]);
				if (positionPlace == arr[i]) {
					break;
				}
			}
			if (i == arr.length) {
				System.out.println("Missing number in the given array is: " + positionPlace);
			}
		}
	}
}
