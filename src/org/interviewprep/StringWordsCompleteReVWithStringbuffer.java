package org.interviewprep;

public class StringWordsCompleteReVWithStringbuffer {
	
	public static void main(String[] args) {
		
		String s =  "Hey Rachana How r u";
		
		StringBuffer s1 = new StringBuffer(s).reverse();
		
		System.out.println(s1.toString());
	}

}
