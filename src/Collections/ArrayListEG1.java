package Collections;

import java.awt.List;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayListEG1 {

	public static  void main(String[] args) {
		
		ArrayList<Object> stral1 = new ArrayList<>();
		stral1.add("aaa");
		stral1.add("aaa");
		stral1.add("ccc");
		stral1.add("bbb");
		stral1.add("ccc");
		stral1.add("bbb");
		stral1.add(1,"111");
		
		//String[] strarr1 = (String[]) stral1.toArray() ;              // ArrayList to string array
				
//		String[] strarr1 = {"aa","bb","cc"};                          //string array to ArrayList
//		List stral2 = (List) Arrays.asList(strarr1);
		
		//...............traversing ArrayList.............
//		stral1.forEach(a -> System.out.println(a)); 					// way1 : using lambda function
//		for(int i=0;i<stral1.size(); i++) {    		  					// way2 : manually
//			System.out.println(stral1.get(i));
//		}		
//		Iterator<Object> itr = stral1.listIterator();				// way3 : using iterator
//		while (itr.hasNext()) {     System.out.println(itr.next());		}
//		stral1.stream().forEach(i -> {System.out.print(i + " ");});   // way4 : using .stream() of java8
		
		//...............manipulating ArrayList.............
//		System.out.println(stral1.contains("aaa"));
//		System.out.println(stral1.indexOf("aaa"));
//		System.out.println(stral1.lastIndexOf("ccc"));
//		System.out.println(stral1.remove("aaa"));						// remove ele at index or obj
//		stral1.set(1, "hhh");											// replace at index
//		stral1.sort(new Comparator<String>() {	public int compare(String o1, String o2) { return 0;}	});
//		System.out.println(stral1);
		
		//...............cloning ArrayList.............
//		ArrayList<String> stral2 = new ArrayList<String>();
//		stral2=stral1;
//		ArrayList list1 = new ArrayList();
//		list1.addAll(stral1);
//		ArrayList<String> stral3 = (ArrayList<String>) stral2.clone();
//		stral2=stral1; // we can also use to clone AL ArrayList<String> newc1 = (ArrayList<String>)c1.clone()
//		stral1.sort(Comparator.naturalOrder());
//		Collections.sort(stral1);

		//...............removing duplicate from ArrayList.............
//		HashSet<String> set1 = new HashSet(stral1); //removing duplicate from ArrayList using HashSet
//		ArrayList<String> stral2 = new ArrayList<String>(set1);
//		List stral2 = stral1.stream().distinct().collect(Collectors.toList()); //removing duplicate from ArrayList using .stream()
//		System.out.println(stral1);

		//...............removing elements from ArrayList.............
//		stral1.clear();  												//Removes all of the elements from this list.
//		stral1.remove(1);												// remove single element
		
		//...............ArrayList to Array.............
		//https://www.geeksforgeeks.org/convert-list-to-array-in-java/
	}

}
