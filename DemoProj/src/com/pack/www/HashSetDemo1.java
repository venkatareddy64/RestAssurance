package com.pack.www;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(9);
		System.out.println(hs);
		HashSet h=new HashSet();
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(6);
		System.out.println(h);
		hs.addAll(h);
		System.out.println(hs);
		hs.removeAll(h);
		System.out.println(hs);
		h.retainAll(hs);
		System.out.println(h);
		System.out.println(hs.containsAll(h));



	}

}
