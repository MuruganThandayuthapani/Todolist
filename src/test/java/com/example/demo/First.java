package com.example.demo;
  class Firstc{
	
	 String name="ram";
	 //constructor
	public Firstc() {
		
		System.out.println("My Bike name is:"+name);
	}
	
	public Firstc(String d)
	{
		System.out.println("Parameter constructor:" +d);
	}

	public void functionone()
	{
		System.out.println("function one called");
	}
	
	public void parameter(String n)
	{
		System.out.println(""+n);
	}
}
  
public class First extends Firstc {
	
	static String name="Pinkly";
	
	public static void main(String[] args) 
	{
		String f="raj";
		
		
		//System.out.println("Hello World");
		//Firstc ddd=new Firstc();
		//Firstc n=new Firstc(f);
		//ddd.functionone();
		//ddd.parameter(name);
		First nnn=new First();
		
		
		try
		{
			int [] myarray= {1,2,3};
			
			//System.out.println(myarray[10]);
			int a=13;
			
			String tt="book";
			
			nnn.methodovevrloading(a);
			nnn.methodovevrloading(tt);
			
			a='d';
		}
		catch( Exception e) 
		{
			System.out.print("no dd");	
		}
	}

	public First()
	{
		System.out.print("first");
	}	
	
	public void methodovevrloading(int a)
	{
		System.out.print(a);
	}
	
	public void methodovevrloading(String a)
	{
		System.out.print("ss");
	}
	
}
