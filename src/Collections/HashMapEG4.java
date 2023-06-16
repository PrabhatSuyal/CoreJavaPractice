package Collections;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;
*/

public class HashMapEG4 {

	public static void main(String[] args) {
		
		Employee1 emp1 = new Employee1(1, "John", 25);
        Employee1 emp2 = new Employee1(2, "Jane", 30);
        Employee1 emp3 = new Employee1(3, "Jim", 35);
        Employee1 emp4 = new Employee1(1, "John", 25); // same as emp1
        Employee1 emp5 = new Employee1(5, "null1", 0);
        Employee1 emp6 = new Employee1(6, "null2", 0);

        HashMap<Integer, Employee1> employeeMap = new HashMap<Integer, Employee1>();
        employeeMap.put(emp1.getId(), emp1);
        employeeMap.put(emp2.getId(), emp2);
        employeeMap.put(emp3.getId(), emp3);
        employeeMap.put(emp4.getId(), emp4);              //if duplicate key then value would be overridden
        
        employeeMap.put(null, emp5);
        employeeMap.put(null, emp6);                	  // null key is allowed only once else override
        employeeMap.put(7, null);
        employeeMap.put(8, null);                    	  // multiple null values accepted but keys should be different
        

        

//        System.out.println("Size of HashMap: " + employeeMap.size());
        

		//...............traversing ArrayList.............
//        for (Map.Entry<Integer, Employee1> empEntry : employeeMap.entrySet()) {									// way 1
//			System.out.println("entrySet() = "+empEntry+"____"+empEntry.getValue().getAge()+" : "+empEntry.getValue().getName());
//		}
//        System.out.println(employeeMap.get(2).getName());
//        IterableMap<Integer, Employee1> map1 = new HashedMap<Integer, Employee1>(); map1.putAll(employeeMap);		// way 2
//        MapIterator<Integer, Employee1> it = map1.mapIterator();
//        while (it.hasNext()) {  System.out.println("---> "+it.next()+" getkey() "+it.getKey()+" getValue() : "+it.getValue().getName());    }
        
		//...............manipulating ArrayList.............
//		System.out.println("contains() key : "+employeeMap.containsKey(2)+". Value : "+employeeMap.containsValue(emp2));
//		System.out.println("remove() "+employeeMap.remove(2).getName());						// remove ele at index or obj

		//...............cloning ArrayList.............
//		Map<Integer, Employee1> stral2 = new HashedMap<>();
//		stral2=employeeMap;
//      HashMap<Integer, Employee1> stral2 = (HashMap<Integer, Employee1>) employeeMap.clone();

		//...............removing elements from ArrayList.............
//		employeeMap.clear();  												//Removes all of the elements from this list.
//		employeeMap.remove(1);												// remove single element
        

		
		
      for (Map.Entry<Integer, Employee1> empEntry : employeeMap.entrySet()) {
			try{
				System.out.println(empEntry.getKey()+" : "+empEntry.getValue().getAge()+" : "+empEntry.getValue().getName());
			}catch (Exception e) {
				System.out.println(empEntry.getKey()+" : "+empEntry.getValue());
			}
		}
	

		
		
	}

}



class Employee1 {

    private int id;
    private String name;
    private int age;

    public Employee1(int id, String name, int age) {
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

}