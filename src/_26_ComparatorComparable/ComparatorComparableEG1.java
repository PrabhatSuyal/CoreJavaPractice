package _26_ComparatorComparable;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparableEG1 {

	public static void main(String[] args) throws IOException {
		
		Integer[] intarr1 = {4,6,2,9,6,3};      
		//Arrays.sort(intarr1, new Comp1());            //Integer class is not changeable so only comparator can be used
		List<Integer> intList1 = Arrays.asList(intarr1);//we can't convert int[] to List of Integer as int don't extends objects
		Collections.sort(intList1, new Comp1());
		intList1.forEach(n -> System.out.println(n));		
		System.out.println(intList1.equals(intList1));  //
		
	}
}

class Comp1 implements Comparator<Integer>{              //categorize odd/even and compare according to asc order
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1%2==o2%2) {
			return o1.compareTo(o2);
		}else if(o1==o2) {
			return 0;
		}else if(o1%2==0) {
			return -1;
		}else {
			return 1;
		}		
	}
}