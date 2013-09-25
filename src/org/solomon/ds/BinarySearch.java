package org.solomon.ds;
public class BinarySearch {

	private int [] m_Data;
	
	private int m_Begining;
	
	private int m_Middle;
	
	private int m_End;
	
	public BinarySearch(int [] Data){
		 m_Data = Data;
	}
	
	
	public int  Search( int value){
		
		return this.Search(value, 0, m_Data.length);
	}
	
	private int Search(int target,int begin,int end){
		
		
		if(begin > end)
			return -1;
		
		int middle = (begin + end) /2;
		
		int middlevalue = m_Data[middle];
		
		if (middlevalue > target) { return Search(target, begin, middle-1); }
		if (middlevalue < target) { return Search(target, middle+1, end); }
		  return middle; //found!
	}
}
