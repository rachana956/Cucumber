package org.interviewprep;

import java.util.Arrays;

public class ArrayDeleteDuplicateFromanSortedary {
	
	
	public static void main(String[] args) {
		
		
		int[] a = {1,1,2,2,3,3,4,4};
		
		
		int[] b = new int[a.length];
		
		int uniq =0;
		
		for (int i = 1; i < b.length; i++) {
			
			
			if(a[i]!=a[i-1]) {
				
				b[i]=a[i];
				
				
				
			}
			
		}
		
		
		System.out.println(Arrays.toString(b));
	}

}
