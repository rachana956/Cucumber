package org.interviewprep;

public class StringWordsRev {

	public static void main(String[] args) {

		String s = "hwllo how";

		String[] split = s.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {

			System.out.print(split[i]+" ");

		}

	}
}
