package com.pack.www;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SplitClass {

	public static void main(String[] args)
	{
		String str="ABCDEFGHIJKLMNOP";
		String str1=str.substring(0, 8);
		String str2=str.substring(9,16);
		System.out.println(str1);
		StringBuffer sb=new StringBuffer(str1);
		System.out.println(sb.reverse()+""+str2);
		
		
		}

}