package numbers;

public class KeithNumber {
/*
 26. Write a Program in Java to check whether a number is a Keith Number or not. Go to the editor
In recreational mathematics, a Keith number or repfigit number (short for repetitive Fibonacci-like digit) is a number in the following integer sequence:
14, 19, 28, 47, 61, 75, 197, 742, 1104, 1537, 2208, 2580, 3684, 4788, 7385, 7647, 7909, 31331, 34285, 34348, 55604, 62662, 86935, 93993, 120284, 129106, 147640, 156146, 174680, 183186, 298320, 355419, 694280, 925993,

Expected Output
Input a number: 75                                                         
Keith Number
 */
	public static void main(String[] args) {
		
		int num=75, int1=num;
		String str1 = Integer.toString(num);
		int arrlen=str1.length();
		int[] intarr= new int[arrlen];
		for(int i=0; i<arrlen; i++) {
			intarr[arrlen-1-i]=int1%10;
			int1=int1/10;
		}
		int sum=0;
		while(sum<num) {
			sum=0;
			for (int i : intarr) {
				sum=sum+i;
			}			
			for(int i=0; i<arrlen-1; i++) {
				intarr[i]=intarr[i+1];
			}
			intarr[arrlen-1]=sum;
			System.out.println(num+"******************"+sum);
		}
		//System.out.println(num+"******************"+sum);
		if(num==sum) {System.out.println(num+" is a Keith number");}
		/*
		 7,5 = 12; 5+12=17; 12+17=29; 17+29=46; 29+46=75
		 * */
	}

}
