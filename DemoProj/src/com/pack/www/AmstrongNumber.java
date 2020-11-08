package com.pack.www;

public class AmstrongNumber {

	public static void main(String[] args) {
   int n=153,r,temp,sum=0;
   temp=n;
   while(n!=0)
   {
	   r=n%10;
	   sum=sum+r*r*r;
	   n=n/10;
   }
   if(temp==sum)
   {
	   System.out.println(temp+" it is amstrong number");
   }
   else
   {
	   System.out.println(temp+" it is not amstrong number");
   }
	}

}
