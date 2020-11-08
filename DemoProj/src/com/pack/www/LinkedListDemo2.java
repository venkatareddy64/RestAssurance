package com.pack.www;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add("X");		
		ll.add("Y");
		ll.add("Z");
		ll.add("A");
		ll.add("B");
		ll.add("C");
		System.out.println(ll);
		LinkedList l=new LinkedList();
		l.addAll(ll);
		System.out.println(l);
		//l.removeAll(ll);
		//System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println(l);


		

	}

}
