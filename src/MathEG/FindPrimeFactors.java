package MathEG;

import java.util.HashSet;
import java.util.Set;

public class FindPrimeFactors {

	public static void main(String[] args) {
		
		int num=400;
		Set<Integer> set1 = new HashSet<Integer>();
		for(int i=2; i<=num; i++) {
			while(num%i==0) {
				set1.add(i);
				//System.out.println(i);
				num=num/i;
			}
		}
		for (Integer integer : set1) {
			System.out.println(integer);
		}
	}

}
