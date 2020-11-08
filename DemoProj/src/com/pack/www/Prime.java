package com.pack.www;

public class Prime {

	public static void main(String[] args) 
	{
     int n=5,flag=1;
     for(int i=2;i<=n/2;i++)
     {
    	 if(n%i==0)
    	 {
    		 flag=0;
    		 break;
    	 }
     }
    	 if(flag==1)
    	 {
    		 System.out.println(" prime number");
    		 
    	 }
    	 else
    		 System.out.println("not prime nymber");
    	 }
	

}
