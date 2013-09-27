package org.solomon.ds;

public class InsertionSort {
	
	private int [] m_Data;
	
	private int m_Length;
	
	public InsertionSort(int [] _Data){
		
		m_Data =  _Data;
		
		m_Length =  m_Data.length;
	}

	public int [] Sort(){
		
		for(int i = 1;i< m_Length; i++){
			
			int temp = m_Data[i];
			
			int j = i-1;
			
			for(; j >= 0 && m_Data[j] > temp; --j) {
				m_Data[j+1] = m_Data[j];
			    }
			m_Data[j+1] = temp;
		}
		
		return null;
	}
}
