package org.solomon.ds;

public class LinkedList<T> {

	private Node m_Head;
	
	private Node m_Tail;
	
	private int m_Count;
	
	public LinkedList(){
		m_Head = null;
		m_Tail = null;
		m_Count = 0;
		
	}
	public void Add(T value){
		
	}
	
	public void Remove(T value){
		
	}
	
	public void Find(T value){
		
	}
	
	public void Enumerate(){
		
	}
	
	private void addFirst(Node node){
		
		Node temp =  m_Head;
		
		m_Head = node;
		
		m_Head.setNext(temp);
		
		m_Count++;
		
		if(m_Count == 1){
			
			m_Tail = m_Head;
		}
		
	}
	
	private void addLast(Node node){
		
		if(m_Count == 0){
			
			m_Head = node;
		}else{
			
			m_Tail.setNext(node);
		}
		
		m_Tail =  node;
		m_Count++;
	}
}
