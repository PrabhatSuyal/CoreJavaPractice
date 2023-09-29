package _24_ArraysEG;

public class SumOfContigiousArray {
/*
 66. Write a Java program to find contiguous subarray within a given array of integers which has the largest sum.   Go to the editor

In computer science, the maximum sum subarray problem is the task of finding a contiguous subarray with the largest sum, within a given one-dimensional array A[1...n] of numbers. Formally, the task is to find indices and with, such that the sum is as large as possible.

Example:
Input :
int[] A = {1, 2, -3, -4, 0, 6, 7, 8, 9}
Output:
The largest sum of contiguous sub-array: 30
 */
	public static void main(String[] args) {
		
		int[] A = {1, 2, -3, -4, 0, 6, 7, 8, 9};
		for(int len=1; len<=A.length; len++) {
			int counter=0, sum=0;
			for(int i=0; i<=A.length-len; i++) {
				while(counter<len) {
					//sum=sum+sumof_i_to_len;
					//sum=sum+A[counter--];
					System.out.println(i+counter);
					counter++;
				}				
				System.out.println("-------------");
			}
			System.out.println("*************************");
		}
		
	}

}
