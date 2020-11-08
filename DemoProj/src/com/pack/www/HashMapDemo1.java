package com.pack.www;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args)
	{

		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the key Number:");
		//int no=sc.nextInt();
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "John");
		hm.put(2, "Scott");
		hm.put(3, "Weasily");
		hm.put(4, "David");
		hm.put(5, "Trumph");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		hm.remove(3);
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm.containsKey(4));
		System.out.println(hm.containsValue("David"));
		System.out.println("Ok....");
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
