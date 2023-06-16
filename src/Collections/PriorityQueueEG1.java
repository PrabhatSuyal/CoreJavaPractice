package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEG1 {

	public static void main(String[] args) {
		
		PriorityQueue<Student> pq = new PriorityQueue<Student>();								//using Comparable
//		PriorityQueue<Student> pq = new PriorityQueue<Student>(new CompPriorityQueueEG1());		//using Comparator
		
		pq.add(new Student(55, "name1"));
		pq.add(new Student(2, "name2"));
		pq.add(new Student(9, "name3"));
		pq.add(new Student(33, "name4"));
		pq.add(new Student(75, "name5"));
		pq.add(new Student(32, "name6"));
		pq.add(new Student(45, "name7"));

		
		//...............traversing PriorityQueue.............
//		while(pq.peek()!=null) {										// sequence of priority
//			System.out.println(pq.poll().roll);
//		}
//		for (Student student: pq) {										// no sequence of priority
//			System.out.println(student.roll);
//		}
//		pq.forEach(a -> System.out.println(a.roll)); 					// way1 : using lambda function
//		pq.stream().forEach(i -> {System.out.println(i.roll + " ");});   // way4 : using .stream() of java8
//		Iterator<Student> iterator = pq.iterator();						// no sequence of priority
//		while(iterator.hasNext()) {
//            System.out.print(iterator.next().roll+" ");
//		}
		
		//...............manipulating PriorityQueue.............
//		Object[] stdarrStudents = pq.toArray();
//		for (Object object : stdarrStudents) {
//			System.out.println(object);
//		}
//		System.out.println(pq.contains(new Student(33, "name4")));
//		System.out.println("size of Priority queue"+pq.size());
		
		//...............cloning PriorityQueue.............
//		PriorityQueue<Student> pq2 = pq;								// way 1
//		PriorityQueue<Student> pq1 = new PriorityQueue();				// way 3
//		pq1.addAll(pq);

		//...............removing duplicate from PriorityQueue.............
//		HashSet<Student> set1 = new HashSet(pq); //removing duplicate from PriorityQueue using HashSet
//		PriorityQueue<Student> pq2 = new PriorityQueue<Student>();
//		pq2.addAll(set1);
		
		
		//...............removing all elements from PriorityQueue.............
//		System.out.println(pq.poll().roll);										// remove the top element
//		System.out.println("removed student roll is : "+pq.remove().roll);		
//		pq.clear(); 
		
	}
}

class CompPriorityQueueEG1 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.roll, o2.roll);
	}	
	
}


class Student implements Comparable<Student>{										
	int roll;
	String name;
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student student) {
		return Integer.compare(this.roll,student.roll);
	}
	
}
