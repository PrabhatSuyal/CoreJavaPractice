package java_basics_II;

public class Sum2dArray {

	/*
	 Your task is to develop a small part of spreadsheet software. Write a Java program which adds up columns and rows of given table as shown in the specified figure: Go to the editor

Input number of rows/columns (0 to exit)
4
25 69 51 26
68 35 29 54
54 57 45 63
61 68 47 59
Result:
   25   69   51   26  171
   68   35   29   54  186
   54   57   45   63  219
   61   68   47   59  235
  208  229  172  202  811
	 */
	
	public static void main(String[] args) {
		
		int[][] arr1= {{1,2,3},
						{4,5,6},
						{7,8,9}};
		int len= arr1.length;
		int[] arr2 = new int[len]; int sumrow=0, rowcount=0;
		int[] arr3 = new int[len]; int colcount=0;
		for (int[] is : arr1) {
			for (int i : is) {
				//System.out.println(i);
				sumrow=sumrow+i;
			}
			arr2[rowcount]=sumrow;
			sumrow=0; rowcount++;
			
			colcount=len-1;
			while(colcount>=0) {
				arr3[colcount]=arr3[colcount]+is[colcount];
				colcount--;
			}
			
		}
		for (int x=0; x<len; x++){System.out.println(arr2[x]+"__"+arr3[x]);}
	}

}
