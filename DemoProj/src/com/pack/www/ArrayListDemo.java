package com.pack.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{
	public static void main(String args[])
	{
		List<Integer>list=new ArrayList<Integer>();
		//1.adding the objects into list
		list.add(1);
		list.add(7);
        list.add(8);
        list.add(3);
        list.add(6);
        System.out.println(list);
        //2.remove the object from the list
       // list.remove(1);
        System.out.println(list);
        //3.add the object in specific index position
        list.add(3, 10);
        System.out.println(list);
        //4.retrive the object from specifc index position
        System.out.println(list.get(5));
        //5.Size of the list
        System.out.println(list.size());
        //6.Element is present in list
        System.out.println(list.contains(10));
        //7.Collection is empty or not
        System.out.println(list.isEmpty());
       // list.clear();
       // System.out.println(list);
        List<Integer>l=new ArrayList<Integer>();
        l.addAll(list);
        System.out.println(l);
        Iterator<Integer>itr=l.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}

	
	

}
