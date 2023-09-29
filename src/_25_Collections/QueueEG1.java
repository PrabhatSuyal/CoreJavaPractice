package _25_Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEG1 {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
	      queue.add("Java");
	      queue.add("JavaFX");
	      queue.add("OpenCV");
	      queue.add("Coffee Script");
	      queue.add("HBase");
	      
	      Queue<Comparable> PQ1 = new PriorityQueue();
	      PQ1.add(1);
	      PQ1.add(2);
	      PQ1.add(3);	      
	      PQ1.add(10);
	      PQ1.add((int)'d');
	      PQ1.add(30);
	      PQ1.add(20);
	      PQ1.add(5);
	      
	      //PQ1.remove(2);                                  //removes element from inbetween
	      System.out.println(">>> "+PQ1);
	      
	      System.out.println(queue+"...............");         //queue to array
	      while(queue.peek()!=null) {
	    	  System.out.println(queue.poll());
	      }
	      
//	      System.out.println("Element at the top of the queue: "+queue.poll());
//	      Iterator<String> it = queue.iterator();
//	      System.out.println("Contents of the queue: ");
//	      while(it.hasNext()) {
//	         System.out.println(it.next());
//	      }
		
	}

}
