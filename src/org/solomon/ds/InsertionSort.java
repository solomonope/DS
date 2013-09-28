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
		
		return m_Data;
	}

	public int [] sort(){
		 for(int i = 1; i< m_Data.length; i++){
			 
			 int temp = m_Data[i];
			 int holepos = i;
			 
			 while(holepos >0 &&  temp < m_Data[holepos -1]){
				 m_Data[holepos] = m_Data[holepos-1];
				 
				 holepos--;
				 
			 }
			 m_Data[holepos] = temp;
		 }
		return null;
	}
}
