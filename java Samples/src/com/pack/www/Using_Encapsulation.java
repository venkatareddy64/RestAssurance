package com.pack.www;

public class Using_Encapsulation
{
	private int id;
	private String name;
	private double salary;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
public static void main(String args[])
{
	Using_Encapsulation obj=new Using_Encapsulation();
	obj.setId(121);
	obj.setName("Venkatareddy");
	obj.setSalary(30000.00);
	System.out.println("Employee id:"+obj.getId());
	System.out.println("Employee name:"+obj.getName());
	System.out.println("Employee Slalary:AQ1"+obj.getSalary());
}
}
