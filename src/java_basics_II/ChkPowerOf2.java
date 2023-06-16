package java_basics_II;

public class ChkPowerOf2 {

	public static void main(String[] args) {
		
		int a=31;
		
		while(a!=1) {
			
			if(a%2==1) {
				System.out.println("not a power of 2");
				break;
			}
			a=a/2;
			if(a==1) {
				System.out.println("is a power of 2");
			}
		}
		
	}

}
