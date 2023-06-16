package java_basics_II;

public class NoCombination {

	
	/*
	 Write a Java program to find the number of combinations that satisfy p + q + r + s = n where n is a given number <= 4000 and p, q, r, s in the range of 0 to 1000. Go to the editor

Sample Output:

Input a positive integer:
252
Number of combinations of a,b,c,d:
2731135
	 */
	public static void main(String[] args) {
		
		int result=7; int count=0;
				
		for(int a=0; a<10 ; a++) {
			for(int b=0; b<10 ; b++) {
				for(int c=0; c<10 ; c++) {
					for(int d=0; d<10 ; d++) {
						if(a+b+c+d<=40 && a+b+c+d==result) {
							//System.out.println(a+" "+b+" "+c+" "+d);
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
		
	}

}
