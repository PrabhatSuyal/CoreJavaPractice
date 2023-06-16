package __RoughPractice__;

public class FactorialOfANumber {
	
	public static void main(String[] args) {
		int i=6, ans = 1;
		
		while (i>0) {
			ans = ans*i;
			i--;
		}
		System.out.println(ans);
	}

}
