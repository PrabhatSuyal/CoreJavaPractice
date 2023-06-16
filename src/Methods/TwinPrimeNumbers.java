package Methods;

import java.awt.List;
import java.util.ArrayList;

public class TwinPrimeNumbers {
/*
 16. Write a Java method to find all twin prime numbers less than 100. Go to the editor

Expected Output:

(3, 5)                                                   
(5, 7)                                                   
(11, 13)                                                 
(17, 19)                                                 
(29, 31)                                                 
(41, 43)                                                 
(59, 61)                                                 
(71, 73) 
 */
	public static void main(String[] args) {
		
		int max=100;
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		for(int i=3; i<=max; i++) {
			boolean prime = true;
			for(int j=i-1 ; j>1; j--) {
				if(i%j==0) {
					prime = false;
					break;
				}
			}
			if(prime==true) {
				//intlist.add(Integer.toString(i));
				intlist.add(i);
			}
		}
		
		for(int k=0; k<intlist.size()-1; k++) {
			if(intlist.get(k)+2==intlist.get(k+1))
			System.out.println(intlist.get(k)+"   "+intlist.get(k+1));
		}
		/*for (Integer ii : intlist) {
			System.out.println(ii);
		}*/
	}

}
