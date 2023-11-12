package org.interviewprep;

public class ReverseWholelettersinStringwords {
	
	public static void main(String[] args) {
		
		String s = "hey there whts up";
		
		String[] split = s.split("");
		
		for (int i = split.length-1; i >= 0; i--) {
			
			char c = s.charAt(i);
			
			System.out.print(c);
			
		}
	}

}
