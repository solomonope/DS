package org.solomon.ds;

public class SelectionSort {

	int [] m_Data;
	
	public SelectionSort(int [] _Data){
		
		m_Data = _Data;
	}
	
	public int [] Sort(){
		
		for(int i = 0; i< m_Data.length-1; i++){
			
			int _Temp = m_Data[i];
			
			int _Min = this.Min(i, m_Data.length);
			
			int intd = m_Data[_Min];
			
			m_Data[i]  = intd;
			
			m_Data[_Min] = _Temp;
			
			
		}
		
		return m_Data;
	}
	
	private int Min(int _Start, int _End){
		
		int Min = _Start;
		
		for(int i = _Start; i< _End; i++){
			
			if(m_Data[Min] > m_Data[i]){
				
				Min = i;
			}
		}
		return Min;
				}
}
