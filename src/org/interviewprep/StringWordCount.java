package org.interviewprep;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringWordCount {

	public static void main(String[] args) {
		String s = "hi how are you how you are hi";

		String s1 = s.toLowerCase();

		String[] split = s1.split(" ");

		Map<String, Integer> m = new LinkedHashMap<>();

		for (String str : split) {

			if (m.containsKey(str)) {

				Integer count = m.get(str);

				m.put(str, ++count);
			} else {

				m.put(str, 1);

			}
		}

		System.out.println(m);
	}

}
