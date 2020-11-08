package com.pack.www;

import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) 
	{
		PriorityQueue p=new PriorityQueue();
		p.add(1);
		p.add(2);
		p.offer(3);
		p.add(5);
		System.out.println(p);
		//System.out.println(p.element());
		//System.out.println(p.peek());
		System.out.println(p.remove());
		System.out.println(p.poll());

	}

}
