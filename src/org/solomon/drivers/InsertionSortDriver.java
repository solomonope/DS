package org.solomon.drivers;

import org.solomon.ds.*;

public class InsertionSortDriver {

	public static void main (String [] a){
		
		int [] sort = {7,7, 4,4, 5, 2,2, 9, 1};
		
		InsertionSort st = new InsertionSort(sort);
		
		int [] returnsort = st.SortX();
		
		for(int i=0; i<returnsort.length-1;i++){
			System.out.println(returnsort[i]);
		}
		
		
	}
}
