package org.interviewprep;

public class ReverseAStringwithStringBuilder {

	public static void main(String[] args) {

		String s = "helooo";

		StringBuilder rev = new StringBuilder(s).reverse();

		String s1 = rev.toString();
		System.out.println(s1);

	}

}
