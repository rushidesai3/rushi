package com.corejava;

import java.util.StringTokenizer;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		System.out.println(reverse("Welcome to United state vitu tank"));

	}

	public static String reverse(String str) {
		if (str == null || str.length() == 1) {
			return str;
		}

		StringTokenizer tocken = new StringTokenizer(str, " ", true);
		StringBuffer sb = new StringBuffer();

		char[] charArr;
		char temp;
		int count = 1;

		while (tocken.hasMoreTokens()) {
			String st = tocken.nextToken();
			if (st.equals(" ")) {
				sb.append(st);
			} else if (count % 2 == 0 && count != 0) {
				sb.append(capitalizeFirstLetters(st));
				count++;
			} else {
				count++;
				charArr = st.toLowerCase().toCharArray();
				int len = st.length();
				for (int i = 0; i < len / 2; i++) {
					temp = charArr[i];
					charArr[i] = charArr[len - i - 1];
					charArr[len - i - 1] = temp;
				}
				sb.append(charArr);
			}

		}
		return sb.toString();
	}

	public static String capitalizeFirstLetters(String s) {
		StringBuffer result = new StringBuffer();
		StringTokenizer tokenizer = new StringTokenizer(s, " ", true);
		while (tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			if (" ".equals(currToken)) {
				result.append(" ");
			} else if (Character.isLowerCase(currToken.charAt(0))) {
				result.append(Character.toUpperCase(currToken.charAt(0)));
				result.append(currToken.substring(1));
			} else {
				result.append(currToken);
			}
		}
		return result.toString();
	}
}
