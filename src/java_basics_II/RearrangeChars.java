package java_basics_II;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class RearrangeChars {

	/*
	 *192. Write a Java program to rearrange the alphabets in the order followed by the sum of digits in a given string containing uppercase alphabets and integer digits (from 0 to 9). Go to the editor
input : AND456HSE8
Expected Output:

ADEHNS23
	*/
	public static void main(String[] args) {
		
		String str = "AND456HSE8";
		char[] chararr = str.toCharArray();
		Arrays.sort(chararr);
		int charptr=0, sum=0;
		for(int i=0; i<chararr.length; i++) {
			if(chararr[i]<58 && chararr[i]>46) {
				if(charptr==0) {
					charptr=i;
				}
				sum=sum+Integer.parseInt(String.valueOf(chararr[i]));  // also we can use Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
		System.out.println(new Date());
	}

}
