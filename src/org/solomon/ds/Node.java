
package org.solomon.ds;

public class Node {

	private int m_Value;
	
	private Node m_Next;
	
	public int getValue(){
		return this.m_Value;
	}
	
	public void setValue(int _Value){
		
		this.m_Value = _Value;
	}
	
	public Node getNext(){
		return this.m_Next;
	}
	
	
	public void setNext(Node _Next){
		
		this.m_Next = _Next;
	}
}
