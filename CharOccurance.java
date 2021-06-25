package week1.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		// char[] count = new char[20];
		char[] temp = new char[12];
		int[] occur = new int[12];
		int num = 0,moreThanOne=0, k = 0;
		char[] strCharArray = str.toCharArray();
		for (int i = 0; i < strCharArray.length; i++) {
			for (int j = 0; j < strCharArray.length; j++) {
				if (strCharArray[i] == strCharArray[j]) {
					num++;
					
				}
			}
			if(num==1) {
				temp[k] = strCharArray[i];
				occur[k] = num;
				k++;
				num = 0;
			}
			if (num > 1 && strCharArray[i]!=' '){
				for(int a=0;a<temp.length;a++)
				{
					if(strCharArray[i]==temp[a])
					{
						moreThanOne++;
					}
				}
				if(moreThanOne!=1) {
				temp[k] = strCharArray[i];
				occur[k] = num;
				k++;
				num = 0;
				moreThanOne=0;
				
				}
							
			}
			num = 0;
			moreThanOne=0;
		}

		for(int h=0;h<temp.length-1;h++) {
			System.out.print(temp[h]);
			
			System.out.print(occur[h]);
			System.out.println();
		}

	}
}




/*Char Occurance

public static void main(String[] args) {
	String str = "welcome to chennai";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])) { // existing key
				Integer value = map.get(charArray[i]);
				int newValue = value+1;
				map.put(charArray[i],newValue);
			}else { // it is new entry
				map.put(charArray[i],1);
			}
		}
		System.out.println(map);
	}

}*/
