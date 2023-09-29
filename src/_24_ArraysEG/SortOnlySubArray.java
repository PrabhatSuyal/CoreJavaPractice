package _24_ArraysEG;

import java.util.Arrays;

public class SortOnlySubArray {
/*
 *72. Write a Java program to find and print one continuous subarray (from a given array of integers) that if you only sort the said subarray in ascending order then the entire array will be sorted in ascending order.   Go to the editor

Example:
Input :
nums1 = {1, 2, 3, 0, 4, 6}
nums2 = { 1, 3, 2, 7, 5, 6, 4, 8}
Output:
Continuous subarray:
1 2 3 0
Continuous subarray:
3 2 7 5 6 4
 */
	public static void main(String[] args) {
		
		int[] intarr = { 1, 3, 2, 7, 5, 6, 4, 8} ;
		int[] intsort = intarr;
		Arrays.sort(intsort);
		for (int i : intarr) {
			System.out.println(intarr[1]);			
		}
		//System.out.println(intsort);
		//boolean bol1=true, bol2=true;
		int ptr1=0, ptr2=intarr.length;
		for(int i=0; i<intarr.length; i++) {
			if(intarr[i]==intsort[i]) {
				ptr1++;
			}			
		}
		
		for(int i=(intarr.length-1); i>=0; i--) {
			if(intarr[i]==intsort[i]) {
				ptr2--;
			}			
		}
		System.out.println(ptr1+"___"+ptr2);
		for (int j=ptr1; j<ptr2; j++) {
			System.out.println(intarr[j]);
		}
	}

}
