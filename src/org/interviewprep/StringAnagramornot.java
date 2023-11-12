package org.interviewprep;

import java.util.Arrays;

public class StringAnagramornot {

	public static void main(String[] args) {

		String s = "brag";

		String s1 = "grab";

		if (s.length() != s1.length()) {

			System.out.println("It's not ana anagram");
		} else  {

			char[] c = s.toCharArray();
			char[] c1 = s1.toCharArray();

			Arrays.sort(c);
			Arrays.sort(c1);

			if (Arrays.equals(c, c1) == true) {

				System.out.println("It's an anagram");
			}else {
				
				System.out.println("Both the strings are not anagram");
			}

		}

	}

}
