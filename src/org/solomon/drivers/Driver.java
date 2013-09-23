package org.solomon.drivers;

import org.solomon.ds.*;
public class Driver {

	public static void main(String [] args){
		
		String txt = "AABAACAADAABAAABAA";
		String pat = "AABA";
		
		NaivePattern patt =  new  NaivePattern(pat,txt);
		
		ArrayList list = patt.Find();
		
		System.out.println(list.Get(2));
	}
}
