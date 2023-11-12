package org.interviewprep;

public class Stringduplicate {

	public static void main(String[] args) {

		String s = "hoowr uuat bb cc";

		String s1 = "";

		String s2 = "";

		for (int i = 0; i < s.length(); i++) {

			
			s2 = Character.toString(s.charAt(i));

			if (s1.contains(s2)) {

				s1 += s2;

			}

		
}
		
		
		String replaceAll = s1.replace("\\s", "");
		
		System.out.println(replaceAll);
		
	}

}
