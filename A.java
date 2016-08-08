package com.corejava;

import java.util.HashMap;
import java.util.Map;

public class A {

	public static int C = 0;

	public int counter() {

		return ++C;

	}

	public static void main(String[] args) {

		
		Map m1 = new HashMap();
		
		m1.put(null, "1");
		m1.put("24", "5");
		m1.put(null, "45");
		m1.put("","15");
		m1.put(null, "0");
		
		for (Object key : m1.entrySet()) {
		    System.out.println(key);
		}
		
		
		
		
//		String s = "Rushi";
//		String s1 = new String("Rushi");
//		String s2 = new String("Rushi");
//		String s3 = "Rushi";
//
//		System.out.println(s.equals(s3));
//		System.out.println(s1.equals(s3));
//
//		if (s1 == s2)
//			System.out.println("compared");
//		else
//			System.out.println("not compared");

		// A obj = new A();
		//
		// List l1 = new LinkedList();
		// l1.add(1);
		// l1.remove(1);
		//
		//
		// System.out.println(obj.counter());
		//
		// obj = null;
		// System.out.println(obj.counter());

	}

}
