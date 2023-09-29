package _19_StringEG;

import java.util.Arrays;

public class StringManipulationPractice {

	public static void main(String[] args) {
		
		printSortedArrayUptoIndex();
		
	}

	private static void printSortedArrayUptoIndex() {

		int arr[] = {1,7,3,8,4,7,9,4,2,6};
		int index = 4;
		//List<Integer> list1 = new ArrayList<Integer>(index);
		int[] arr1 = new int[index];
		int[] arr2 = new int[arr.length-index];
		

				for (int i=0; i<index; i++) {
					arr1[i]=arr[i];
				}
		
		Arrays.sort(arr1);

				for (int j = index; j < arr.length; j++) {
					arr2[j-index] = arr[j];
				}
		
		Arrays.sort(arr2);

		for (int i : arr1) {
			System.out.println(i);
		}
		for (int i : arr2) {
			System.out.println(i);
		}
	}

}
