package org.interviewprep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringMaxOccurences {

	public static void main(String[] args) {

		String s = "howrruuuu";

		Map<Character, Integer> m = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (m.containsKey(c)) {

				Integer count = m.get(c);

				m.put(c, ++count);
			} else {
				m.put(c, 1);

			}

		}
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		int countt = 0;
		char key = 0;

		for (Entry<Character, Integer> entry : entrySet) {

			if (entry.getValue() > countt) {

				countt = entry.getValue();
				key = entry.getKey();
			} else {

				countt = countt;
				key = entry.getKey();

			}

		}

		System.out.println(key+" "+countt);
	}
}
