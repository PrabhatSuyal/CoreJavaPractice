package StringEG;

public class SortByStringLen {
/*
 104. Write a Java program to sort in ascending and descending order by length of the given array of strings. Go to the editor

Sample Output:

Original unsorted colors: [Green, White, Black, Pink, Orange, Blue, Champagne, Indigo, Ivory]

Sorted color (descending order): [Champagne, Orange, Indigo, Green, White, Black, Ivory, Pink, Blue]

Sorted color (ascending order): [Pink, Blue, Green, White, Black, Ivory, Orange, Indigo, Champagne]
Click me to see the solution
 */
	public static void main(String[] args) {
		
		String[] str1= {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
		for(int i=0; i<str1.length-1; i++) {
			for(int j=i+1; j<str1.length; j++) {
				//System.out.println(i+"_"+j);
				if(str1[j].length()>str1[i].length()) {
					//System.out.println(str1[i]);
					String temp = str1[j];
					str1[j]=str1[i];
					str1[i] = temp;
				}				
			}
		}
		for (String string : str1) {
			System.out.println(string);
		}
		
		String str3="12";
		System.out.println(Integer.parseInt(str3));
		
	}

}
