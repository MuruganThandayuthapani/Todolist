package com.example.demo;

import java.util.Scanner;

class Demo
{
	public int i =10;
	
	public int increment()
	{
		i=i+10;
		return i;
	}
	public int decrement()
	{
		i=i-10;
		return i;
	}
	
}


public class Demo1
{
		public static void main(String args[])
		{
			System.out.println("Enter the name:");
		Scanner sc=new Scanner(System.in);
		String a;
		a=sc.nextLine();
			
			//Demo obj= new Demo();
			//Demo Obj1 =new Demo();
			
			int vowels=0;
			int vow_A=0;
			int vow_captialA=0;
			int vow_smallA=0;
			int vow_E=0;
			int vow_captialE=0;
			int vow_smallE=0;
			int vow_I=0;
			int vow_captialI=0;
			int vow_smallI=0;
			int vow_O=0;
			int vow_captialO=0;
			int vow_small_O=0;
			int vow_U=0;
			int vow_captialu=0;
			int vow_small_U=0;
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i)=='a'|| a.charAt(i)=='A')
				{
					vowels=vowels+1;
					vow_A=vow_A+1;
					if(a.charAt(i)=='A')
					{
						vow_captialA=vow_captialA+1;
					}
					if(a.charAt(i)=='a')
					{
						vow_smallA=vow_smallA+1;
					}
				}
				if(a.charAt(i)=='e' || a.charAt(i)=='E')
				{
					vowels=vowels+1;
					vow_E=vow_E+1;
					if(a.charAt(i)=='E')
					{
						vow_captialE=vow_captialE+1;
					}
					if(a.charAt(i)=='e')
					{
						vow_smallE=vow_smallE+1;
					}
				}
				if(a.charAt(i)=='i' || a.charAt(i)=='I')
				{
					vowels=vowels+1;
					vow_I=vow_E+1;
					if(a.charAt(i)=='I')
					{
						vow_captialI=vow_captialI+1;
					}
					if(a.charAt(i)=='i')
					{
						vow_smallI=vow_smallI+1;
					}
				}
				if(a.charAt(i)=='o' || a.charAt(i)=='O')
				{
					vowels=vowels+1;
					vow_O=vow_O+1;
					if(a.charAt(i)=='O')
					{
						vow_captialO=vow_captialO+1;
					}
					if(a.charAt(i)=='o')
					{
						vow_small_O=vow_small_O+1;
					}
				}
				if(a.charAt(i)=='u' || a.charAt(i)=='U')
				{
					vowels=vowels+1;
					vow_U=vow_U+1;
					if(a.charAt(i)=='U')
					{
						vow_captialu=vow_captialu+1;
					}
					if(a.charAt(i)=='u')
					{
						vow_small_U=vow_small_U+1;
					}	
				}	
			}
			
			a=a.trim();
			a=a.replace("\\s","");
			String v="";
			for(int q=0;q<a.length();q++)
			{
				char ch=a.charAt(q);
				
				if(!Character.isWhitespace(ch))
				{ 
					v=v+ch;
				}
			}
						
			if(v.length()%2==0)
			{
				System.out.println("Even number");
				int c=v.length()/2;
				
				
				//System.out.println("C vlaue:  "+c);
				String d="";
				for(int j=0;j<v.length();j++)
				{
					
					if(j==c)
					{
					//System.out.println(" char at point: "+a.charAt(c));
					
					d=d+Character.toUpperCase(a.charAt(j));
					
					}
					else if(j==(c-1))
					{
					//System.out.println(" char at point: "+a.charAt(c-1));
					d=d+Character.toUpperCase(v.charAt(j));
					}
					else {
						d=d+v.charAt(j);
					}
					
				}
				
				System.out.println("Chengeed input:  "+d);
			}
			
			else {
				
				System.out.println("odd number");
				int c=(v.length()/2);
				String d = "";
				//System.out.println("C vlaue:  "+c);
				for(int k=0;k<v.length();k++)
				{
						
					if(k==c) {
					//	System.out.println(" char at point: "+a.charAt(c));
						
						d=d+Character.toUpperCase(v.charAt(k));
						
					}
					else {
						d=d+v.charAt(k);
					}
					
				}
				
				System.out.println("Chengeed input:  "+d);
			}
				
			
			
			/*System.out.println( "Total Vowels"+ " "+vowels);
			System.out.println("Total A is "+vow_A);
			System.out.println("Captial A is "+vow_captialA);
			System.out.println("Small a is "+vow_smallA);
			System.out.println("Total E is "+vow_E);
			System.out.println("Captial E is "+vow_captialE);
			System.out.println("Small e is "+vow_smallE);
			System.out.println("Total I is "+vow_I);
			System.out.println("Captial I is "+vow_captialI);
			System.out.println("Small I is "+vow_smallI);
			System.out.println("Total O is "+vow_O);
			System.out.println("Captial O is "+vow_captialO);
			System.out.println("Small O is "+vow_small_O);
			System.out.println("Total U is "+vow_U);
			System.out.println("Captial U is "+vow_captialu);
			System.out.println("Small U is "+vow_small_U);
			*/
			
			//System.out.println(obj.increment());
			//System.out.println(Obj1.increment());
			//System.out.println(obj.decrement());
		}
		
		
}
