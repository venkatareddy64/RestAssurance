package com.pack.www;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class QueueDemo2 {

	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(10);
		l.offer(2);
		l.add(4);
		l.offer(5);
		l.add("Monkey");
		System.out.println(l);
		
		LinkedHashSet ll=new LinkedHashSet();
		ll.add(400);
		ll.add(200);
		ll.add(100);
		ll.add(500);
		System.out.println(ll);
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
