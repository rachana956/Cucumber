package org.interviewprep;

public class Capgstringpgm {
	
	
	public static void main(String[] args) {
		
		
		
		String s ="rachana";
		
		for (int i = 0; i < s.length(); i++) {
			
			
			char c = s.charAt(i);
			
			if(i==0 || i==6) {
				
				continue;
			}
			System.out.println(c);
		}
	}

}
