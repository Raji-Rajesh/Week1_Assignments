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

/*
 * Missing Number
type 1

public class FindMissingNumber2 {
public static void main(String[] args) {
	int[] number= {3,4,6,1,2,5,7,9,10};
	//
	Arrays.sort(number);
	int sum1=0;
	for (int i = 0; i < number.length; i++) {
		sum1=sum1+number[i];
		
	}System.out.println(sum1);
	
	int sum2=0;
	for (int i = 1; i <=10; i++) {
		sum2=sum2+(i);
	}System.out.println(sum2);
	int sum3=sum2-sum1;
	System.out.println("MissingNumber:"+sum3);
}

}

type 2
int[] num= {3,4,6,1,2,5,7,9,10};
	int n=num.length+1;
	int sum=n*(n+1)/2;
	for (int i = 0; i < num.length; i++) {
		sum=sum-num[i];
		System.out.println(sum);
	}
	System.out.println("missing Number:"+sum);
}

}



*/
