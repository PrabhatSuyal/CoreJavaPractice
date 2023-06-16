package java_basics_II;

public class DigitPlaces {
	
	
	/*
	 Let us use the letter H to mean "hundred", the letter T to mean "ten" and “1, 2, . . . n” to represent the ones digit n (<10). Write a Java program to convert 3 digits positive number in given format. For example, 234 should be output as BBSSS1234 because it has 2 "hundreds", 3 "ten", and 4 of the ones. Go to the editor

The student name and id are all strings of no more than 10 characters. The score is an integer between 0 and 100.

Input:
235
230
Output:
HHTTT12345
HHTTT

Input a positive number(max three digits):
235
Result:
HHTTT12345
	  */

	public static void main(String[] args) {
		String str="";
		int i=123; //HTT123
		int counter=1;
		while(i>0) {
			if(counter==1) {
				
				for(int j=i%10; j>0; j--) {
					str=str+Integer.toString(j);
				}
			}
			else if(counter==2) {
				
				for(int j=i%10; j>0; j--) {
					str=str+"T";
				}
			}
			else if(counter==3) {
				
				for(int j=i%10; j>0; j--) {
					str=str+"H";
				}
			}
			i=i/10; counter++;
		}
		System.out.println(str);
		StringBuilder strbdr= new StringBuilder();
		strbdr.append(str);
		System.out.println(strbdr.reverse());
	}

}
