package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class LinkedListEG1 {

	public static void main(String[] args) {
		
		LinkedList ll1 = new  LinkedList<>();
		ll1.add(1);
		ll1.add("aaa");
		ll1.add(2.2);
		ll1.set(0, "bbb");
		

//		String[] strarr1 = (String[]) ll1.toArray() ;              //  java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.String; 
//		String[] strarr1 = {"aa","bb","cc"};                          //string array to LinkedList
		
		//...............traversing LinkedList.............
//		ll1.forEach(a -> System.out.println(a)); 					// way1 : using lambda function
//		for(int i=0;i<ll1.size(); i++) {    		  					// way2 : manually
//			System.out.println(ll1.get(i));
//		}		
//		ListIterator<Object> itr = ll1.listIterator();				// way3 : using iterator
//		while (itr.hasNext()) {     System.out.println(itr.next());		}
//		ll1.stream().forEach(i -> {System.out.println(i + " ");});   // way4 : using .stream() of java8
		
		//...............manipulating LinkedList.............
//		System.out.println(ll1.contains("aaa"));
//		System.out.println(ll1.indexOf("aaa"));
//		System.out.println(ll1.lastIndexOf("ccc"));
//		System.out.println(ll1.remove("aaa"));						// remove ele at index or obj
//		ll1.set(1, "aa");											// replace at index
//		ll1.sort(new Comparator<String>() {	public int compare(String o1, String o2) { return 0;}	});
//		System.out.println(ll1);
		
		//...............cloning LinkedList.............
//		LinkedList ll2 = new LinkedList();
//		ll2=ll1;													// way 1
//		LinkedList<String> ll3 = (LinkedList<String>) ll1.clone();	// way 2
//		LinkedList list1 = new LinkedList();						// way 3
//		list1.addAll(ll1);
//		ll1.sort(Comparator.naturalOrder());
//		Collections.sort(ll1);
//		ll1.remove(1);

		//...............removing duplicate from LinkedList.............
//		HashSet<String> set1 = new HashSet(ll1); //removing duplicate from LinkedList using HashSet
//		LinkedList<String> ll2 = new LinkedList<String>(set1);
		
		
		//...............removing all elements from LinkedList.............
//		ll1.clear(); 
		
		
	}

}
