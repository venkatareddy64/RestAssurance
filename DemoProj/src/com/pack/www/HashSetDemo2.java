package com.pack.www;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args)
	{
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		System.out.println(hs);
		HashSet<Integer>h=new HashSet<Integer>();
		h.add(10);
		h.addAll(hs);
		System.out.println(h);
		h.removeAll(hs);
		System.out.println(h);


	}

}
