package __RoughPractice__;

public class ReverseNumber {

	public static void main(String[] args) {
		int i=3652, j=0;
		
		while (i>0) {
			j=10*j;
			j=j+i%10;
			i=i/10;		
			
		}
		System.out.println(j);

	}

}
