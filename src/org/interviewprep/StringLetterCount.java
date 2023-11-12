package org.interviewprep;

import java.util.HashMap;
import java.util.Map;

public class StringLetterCount {

	public static void main(String[] args) {
		String s = "Wherewereyou";

		String s1 = s.toLowerCase();

		Map<Character, Integer> m = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {

			char c = s1.charAt(i);

			if (m.containsKey(c)) {

				Integer count = m.get(c);

				m.put(c, ++count);

			} else {

				m.put(c, 1);
			}

		}
		System.out.println(m);
	}

}
