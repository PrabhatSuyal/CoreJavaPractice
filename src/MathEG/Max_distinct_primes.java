package MathEG;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Max_distinct_primes {

	public static void main(String[] args) {
		
		int range = 30, max;
		HashMap<Integer,Integer> Hmap1 = new HashMap<Integer,Integer>();
		for(int i=2; i<=range; i++) {
			int nownum=i, count=0;
			Set<Integer> set2 = new HashSet<Integer>();
			for(int j=2; j<=nownum; j++) {
				while(nownum%j==0) {
					//System.out.println(i+" "+j);
					nownum=nownum/j;
					set2.add(j);
				}				
				//System.out.println(i+" "+j+" "+count);
			}
			//System.out.println(set2.size()+" counts of prime no. for "+i);
			Hmap1.put(i, set2.size());
		}
		System.out.println(Collections.max(Hmap1.values()));
	}

}
