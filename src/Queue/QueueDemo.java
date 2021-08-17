package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		 
		PriorityQueue pq = new PriorityQueue();
		
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.add("D");
		pq.add("A");
		
		System.out.println(pq);
		
		//get header element
		System.out.println(pq.element());
		System.out.println(pq.peek());
		
		//return and remove from queue
		
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		
		Iterator it = pq.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		for(Object el : pq) {
			
			System.out.println(el);
		}
	}

}
