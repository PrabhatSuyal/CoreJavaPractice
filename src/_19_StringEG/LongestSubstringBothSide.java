package _19_StringEG;

public class LongestSubstringBothSide {
/*
 93. Write a Java program to find the longest substring appears at both ends of a given string. Go to the editor

Sample Output:

The given string is: playersplay
The longest substring in the string is: play
 */
	public static void main(String[] args) {
		
		String str = "playersplay", str2="";
		char ch2=str.charAt(0);
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch2) {
				str2.concat(Character.toString(ch2));
				//ch2=
			}
		}
		
	}

}
