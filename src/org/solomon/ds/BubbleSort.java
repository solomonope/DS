package org.solomon.ds;
public class BubbleSort<T> {
	
	int [] m_Data;
	
	public BubbleSort(int [] _Data){
		
		m_Data = _Data;
	}
	
	public int [] Sort(){
		int length =  m_Data.length-1;
		boolean swap = false;
		do{
			swap = false;
			for(int i = 0; i<length; i++){
				
				if(m_Data[i] > m_Data[i+1]){
					
					int temp = m_Data[i];
					m_Data[i] = m_Data[i+1];
					m_Data[i+1] = temp;
					swap = true;
				}
			}
			
		}while(swap);
		
		return m_Data;
		
	}

}
