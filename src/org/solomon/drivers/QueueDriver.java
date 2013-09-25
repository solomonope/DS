package org.solomon.drivers;

import org.solomon.ds.Queue;

public class QueueDriver {
	
	public static void main(String []a){
		
		Queue qt = new Queue();
		
		qt.Enqueue(1);
		qt.Enqueue(3);
		qt.Enqueue(5);
		qt.Enqueue(9);
		
		qt.Enqueue(1);
		qt.Enqueue(3);
		qt.Enqueue(5);
		qt.Enqueue(9);
		
		qt.Enqueue(1);
		qt.Enqueue(3);
		qt.Enqueue(5);
		qt.Enqueue(9);
		
		qt.Enqueue(1);
		qt.Enqueue(3);
		qt.Enqueue(5);
		qt.Enqueue(9);
		
		qt.Enqueue(1);
		qt.Enqueue(3);
		qt.Enqueue(5);
		qt.Enqueue(9);
		
		qt.Enqueue(1);
		qt.Enqueue(3);
		qt.Enqueue(5);
		qt.Enqueue(9);
		
		qt.Enqueue(1);
		qt.Enqueue(3);
		qt.Enqueue(5);
		qt.Enqueue(9);
		
		qt.Enqueue(1);
		qt.Enqueue(3);
		qt.Enqueue(5);
		qt.Enqueue(9);
		
		qt.Enqueue(1);
		qt.Enqueue(3);
		qt.Enqueue(5);
		qt.Enqueue(9);
		
		System.out.println(qt.Dequeue());
		System.out.println(qt.Dequeue());
		System.out.println(qt.Dequeue());
		System.out.println(qt.Dequeue());
	}

}
