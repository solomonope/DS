package org.solomon.drivers;

import org.solomon.ds.*;

public class NodeDriver {
	
	
	private  static   void printNode(Node node)
	{
		while(node != null){
			
			System.out.println(node.getValue());
			
			node = node.getNext();
		}
		
	}
	public static void main(String [] a){
		
		Node first = new Node();
		Node middle = new Node();
		Node last = new Node();
		
		first.setValue(1);
		first.setNext(middle);
		
		middle.setValue(2);
		middle.setNext(last);
		
		last.setValue(3);
		
		
		printNode(first);
		
	}

}
