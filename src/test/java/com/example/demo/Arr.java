package com.example.demo;

import java.util.Scanner;

public class Arr {

	
	public static void main(String[] args)
	{
		int[] a= new int[10];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 10 numbers");
		
		for(int j=0;j<10;j++)
		{
			a[j]=sc.nextInt();
		}
			
		sc.close();
		System.out.println("final");
		//int a[]= {1,2,45,78,100,80,16,20,17,36};
		int b=a[0];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("print value: "+a[i]);
			if(b<a[i])
			{
				b=a[i];
			}
			
		}
		
		System.out.println("big"+b);
		
	
	int temp;
	
	for(int h=0;h<a.length;h++)
	{
		for(int g=h+1;g<a.length;g++)
		{
			if(a[g]>a[h])
			{
				temp=a[g];
				a[g]=a[h];
				a[h]=temp;
			}
		}
	}
	
	System.out.println("Desending order");
	for(int l=0;l<a.length;l++)
	{
		System.out.print(","+a[l]);
	}
	
	}
}
