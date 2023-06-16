package java_basics_II;

public class StringCompression {
	
	/*
	 208. Write a Java program to create a basic string compression method using the counts of repeated characters. Go to the editor

Input string: aaaabbbbcccccddddeeee

Expected Output:

Enter a string (you can include space as well)
 aaaabbbbcccccddddeeee
The compressed string along with the counts of repeated characters is:
a4b4c5d4e4
	 */

	public static void main(String[] args) {
		
		String str = "aaaabbbbcccccddddeeee", str1=Character.toString(str.charAt(0));
		int count=0;
		char lastrepchar=str.charAt(0);
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i-1)!=str.charAt(i)) {
				str1=str1+Character.toString(str.charAt(i));
				count=0;
			}else {
				
				if(lastrepchar==str.charAt(i)) {
					count++;
				}
				else {
					str1=str1+Integer.toString(count);
					str1=str1+str.charAt(i);
					count=0;
				}
			}
			
		}
		System.out.println(str1);
	}

}
