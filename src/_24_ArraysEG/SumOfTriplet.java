package _24_ArraysEG;

public class SumOfTriplet {
/*
 74. Write a Java program to find all triplets equal to a given sum in a unsorted array of integers.   Go to the editor

Example:
Input :
nums = { 1, 6, 3, 0, 8, 4, 1, 7 }
Output:
Triplets of sum 7
(0 1 6)
(0 3 4)
 */
	public static void main(String[] args) {
		
		int[] intarr = { 1, 6, 3, 0, 8, 4, 1, 7 };
		
		for(int i=0; i<intarr.length-2; i++) {
			for(int j=i+1; j<intarr.length-1; j++) {
				for(int k=i+2; k<intarr.length; k++) {
					if(intarr[i]+intarr[j]+intarr[k]==7) {
						System.out.println(intarr[i]+" "+ intarr[j]+" "+ intarr[k]);
					}
				}
			}
		}
		
	}

}
