package com.pack.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		al_dup.removeAll(al);
		System.out.println("After removing all elements in the collection:"+al_dup);
		
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		/*for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}*/
		/*for(Object e:al)
		{
			System.out.println(e);
		}*/
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
