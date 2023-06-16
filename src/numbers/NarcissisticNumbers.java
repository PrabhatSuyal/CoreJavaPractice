package numbers;

public class NarcissisticNumbers {
/*
 23. Write a Java program to find all the narcissistic numbers between 1 and 1000. Go to the editor
In number theory, a narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits.
For example:
153 = 13 + 53 + 33

Expected Output
1                                                      
2                                                      
3                                                      
4                                                      
5                                                      
6                                                      
7                                                      
8                                                      
9                                                      
153                                                    
370                                                    
371                                                    
407
 */
	public static void main(String[] args) {
		int count=15300;
		//String ss="34";
		//int ii=Integer.parseInt(Character.toString(c));
		for(int i=1; i<=count; i++) {
			int digits=(Integer.toString(i)).length();
			//int[] intarr= new int[digits];
			long sum = 0;
			for(int j=0; j<digits; j++) {
				//System.out.println(Integer.parseInt(Character.toString(Integer.toString(i).charAt(j)))+"---"+digits+"---"+Math.pow( Integer.parseInt(Character.toString(Integer.toString(i).charAt(j))) , digits));
				sum=(sum+(long)Math.pow(Integer.parseInt(Character.toString(Integer.toString(i).charAt(j))), digits));
			}
			//System.out.println(digits);
			if(sum==i) {
				System.out.println(i);
			}
		}
		System.out.println("***********************");
	}

}
