package __RoughPractice__;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		int startingNumber = 6, count = 1;
		
		for (int j = 6; count <= 7; j++) {
			boolean bol = true;
			for (int j2 = 2; j2 < j; j2++) {
				if (j%j2==0) {
					bol = false;
					break;
				}
			}
			if (bol) {
				count++;
				System.out.println(j);
			}
		}

	}

}
