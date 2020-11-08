package com.pack.www;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args)
	{
   
		LinkedList ll=new LinkedList();
		ll.add("Cat");
		ll.add("Buffelo");
		ll.add("Dog");
		ll.add("Rabbit");
		ll.add("Deer");
		ll.add("Monkey");
		System.out.println(ll);
		ll.addFirst("Elephant");
		ll.addLast("Zebra");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);


	}

}
