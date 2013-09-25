package org.solomon.ds;

public class Queue {

	private int m_Index;
	
	private int m_Size;
	
	private int [] m_Data;
	
	private int m_DequeuIndex;
	
	public  Queue(){
		m_Size = 16;
		
		m_Data =  new int[m_Size];
		
		m_Index  = 0;
		
		m_DequeuIndex = 0;
		
		
		
	}
	
	public void Enqueue(int value){
		
		if(m_Index >= m_Size)
			Grow();
		
		m_Data[m_Index++] = value;
		
		
	}
	
	public int Dequeue(){
		
		if(m_DequeuIndex >= m_Index)
			return -1;
		
		return m_Data[m_DequeuIndex++];
	}
	
	private void Grow(){
		
		m_Size = m_Size *2;
		
		
		int [] temp = m_Data;
		
		m_Data = new int[m_Size];
		
		for(int i = 0; i< temp.length; i++){
			  m_Data[i] =  temp[i];
		}
		
		
	}
}
