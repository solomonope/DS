package org.solomon.drivers;
import org.solomon.ds.*;

public class SelectionSortDriver {
	
	
	public static void main(String [] a)
	{
	int [] sort = {9,8,6,0,4,3,2,34,69,88,6,65,43,2,43,67,68,78,79,69,8,98,97,7};
	
	SelectionSort st = new SelectionSort(sort);
	
	//SelectionSort ts =  new SelectionSort();
	
	int [] returnsort = st.Sort();
	
	for(int i=0; i<returnsort.length-1;i++){
		System.out.println(returnsort[i]);
	}

}

}
