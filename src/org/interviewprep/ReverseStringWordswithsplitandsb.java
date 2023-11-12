package org.interviewprep;

public class ReverseStringWordswithsplitandsb {
	
	public static void main(String[] args) {
		
		String s = "Hi How Are You";
		
		
		StringBuffer s1 = new StringBuffer();
		
		String[] split = s.split(" ");
		
		for (int i = split.length-1; i >= 0; i--) {
			
			
		 s1 = s1.append(split[i]);
			
			if(i!=0) {
				s1.append(" ");
			}
			
		}
		
		System.out.println(s1);
	}

}
