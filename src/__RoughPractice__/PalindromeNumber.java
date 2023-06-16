package __RoughPractice__;

public class PalindromeNumber {

	public static void main(String[] args) {
		int i = 32523, j=i, reverse = 0;
		
		while (j!=0) {
			reverse = 10 * reverse;
			reverse=reverse + j%10;
			j=j/10;
		}
		
		if (i==reverse) {
			System.out.println("palindrome number : "+i);
		}

	}

}
