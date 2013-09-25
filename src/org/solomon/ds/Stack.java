package org.solomon.ds;

public class Stack {
	
	private int [] m_Data;
	
	private int m_Index;
	
	
	public Stack(int _Size){
		
		m_Data =  new int[_Size];
		
		m_Index = -1;
	}
	
	public void Push(int _Data){
		
		m_Index++;
		if(m_Index >= m_Data.length)
			return;
		
		m_Data[m_Index] = _Data;
	}
	
	public int Pop(){
		
		if(m_Index >=0)
		return m_Data[m_Index--];
		
		return -1;
		
	}

}
