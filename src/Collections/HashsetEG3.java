package Collections;

import java.util.HashSet;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HashsetEG3 {

	public static void main(String[] args) {
		
		HashSet<Employee> emphs1 = new HashSet<Employee>();
		emphs1.add(new Employee(1, "name1", 11));
		emphs1.add(new Employee(2, "name2", 22));
		emphs1.add(new Employee(3, "name3", 33));
		emphs1.add(new Employee(4, "name4", 44));
		Iterator<Employee> itrIterator = emphs1.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next().getId());
			
		}
		
		HashSet<String> strhs1 = new HashSet<String>();
		strhs1.add("aaa");
		strhs1.add("bbb");
		strhs1.add("ccc");
		strhs1.add(null);
//		strhs1.add(1,"111"); 									//index will not work in Set
//		strhs1.addAll(Arrays.toList());
		
		
		
//		String[] strarr= {"aa","bb","dd","cc"};								
//		Set<String> strhs2 = new HashSet<String>(Arrays.asList(strarr));
		
//		String[] strarr1 = (String[]) strhs1.toArray() ;              // HashSet to string array
		
		
		//...............traversing HashSet.............
//		for(int i=0;i<strhs1.size(); i++) {
//			System.out.println(strhs1.toString());
//			System.out.println(strhs1.iterator().next());
//			System.out.println(strhs1.toArray()[i]);
//		}
//		strhs1.forEach(a -> System.out.println(a)); 					// way1 : using lambda function		
//		strhs1.stream().forEach(i -> {System.out.print(i + " ");});     // way4 : using .stream() of java8
//		Iterator itr = strhs1.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//...............manipulating HashSet.............
//		System.out.println(strhs1.contains("aaa"));
//		System.out.println(strhs1.containsAll(strhs2));					// check hs2 is subset of set1
//		System.out.println(strhs1.remove("aaa"));						// remove ele at index or obj
		
		
		//...............cloning HashSet.............
//		HashSet<String> strhs2 = new HashSet<String>();
//		strhs2=(HashSet<String>)strhs1;									// downcasting to equate the references
//		HashSet hs1 = new HashSet();
//		hs1.addAll(strhs1);
//		HashSet<String> strhs3 = new HashSet<String>();
//		strhs3 = (HashSet<String>) strhs1.clone();						// clone() works for HashSet not with Set


		//...............removing all elements from HashSet.............
//		strhs1.clear();  												//Removes all of the elements from this list.
//		strhs1.remove("aaa");											// remove single element
//		strhs1.removeAll(strhs1);										// remove all elements
		
//		System.out.println(strhs1);
		
	
		
	}

}


class Employee {

    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

/*    for custom class > need to @Override hashCode() and equals() > whenever hashSet.add(element) is called, 
 * hashcode will be generated for that element, if it is unique it will stored in hashSet if not runs equals()
 * to check weather rest of the features of those elements are same or not, if same discard that element , 
 * if not same store it in hashSet.*/
    
    @Override
    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + age;
//        result = prime * result + id;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
    	
    	System.out.println("____"+this.id+"____"+(id/2==0? 1:2));
//        System.out.println((id/2==0? 1:2));
        return (id%2==0? 1:2);
    }

    @Override
    public boolean equals(Object obj) {
    	System.out.println("......"+this.id+"....."+((Employee)obj).id);
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
        Employee other = (Employee) obj;
//        if (age != other.age)
//            return false;
//        if (id != other.id)
//            return false;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        } else if (!name.equals(other.name))
//            return false;
        return true;
    }
}