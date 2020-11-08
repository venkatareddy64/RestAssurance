package com.pack.www;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add("Apple");
		ll.add(11.6);
		ll.add("Cat");
		ll.add(true);
		ll.add(null);
		System.out.println(ll);
		ll.set(5, "Dog");
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("Dog"));
		ll.remove(3);
		System.out.println(ll);
		/*for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}*/
		/*for(Object e:ll)
		{
			System.out.println(e);
		}*/
		Iterator i=ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
