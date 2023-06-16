package BitSet;

import java.util.BitSet;

public class BitSetEG1 {

	public static void main(String[] args) {
		
		BitSet bit1 = new BitSet();
		bit1.set(0);
		bit1.set(1,false);
		bit1.set(2);
		bit1.set(5);
		//bit1.set(1, 2, true);    //this will update the boolean value stored on that index range
		System.out.println("value of bit1 : "+bit1.toString());
		
		for (int i=0; i<10;i++) {
			System.out.println("at index "+i+" : "+bit1.get(i)+"___");
		}		
		
		BitSet bit2 = bit1;
		bit2.or(bit1);
		System.out.println(bit2);
		
		
	}

}
