package org.solomon.ds;

public class LowArray<T> {
	
	private int   [] m_Data;
	
	public LowArray(int Size){
		
		m_Data = new int [Size];
	}

	public int getItem(int Index){
		
		return m_Data[Index];
	}
	
	public void setElement(int Index, int value){
		 m_Data[Index] = value;
	}
}
