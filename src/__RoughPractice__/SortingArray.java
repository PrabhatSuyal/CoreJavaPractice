package __RoughPractice__;

public class SortingArray {

	public static void main(String[] args) {
		int[] intarr = {8,4,7,4,8,2,3};
		
		for (int i = 0; i < intarr.length-1; i++) {
			for (int j = i+1; j < intarr.length; j++) {
					if ((intarr[i]>=intarr[j])) {
					int temp = intarr[i];
					intarr[i] = intarr[j];
					intarr[j] = temp;
				}
			}
		}
		
		for (int i : intarr) {
			System.out.println(i);
		}
	}

}
