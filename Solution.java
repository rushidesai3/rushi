package com.corejava;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		String A = sc.next();
		StringBuilder br = new StringBuilder(A);
		if (br.reverse().toString().equals(A)) {
			System.out.println("Yes");
		} else
			System.out.println("No");

	}

	 
}