package com.example.demo;
import java.util.*;

public class SSSS {
	
	public static void main(String args[])
	{
		System.out.println("String Reverse: ");
		String str="Murugan";
		System.out.println("String: "+str);
		String resstr="";
		for(int i=0;i<str.length();i++)
		{
			
			resstr=str.charAt(i)+resstr;
		}
		System.out.println("String Revers:"+resstr);
		
	//--------------------------------------------------------------------------------------------------------
	
		System.out.println("Missing number in array sequence number list: ");
		int arr[]= {1,2,3,4,5,6};
		int actual_value;
		int temp_value=0;
		actual_value=(6*7)/2;
		System.out.println("Actual value: "+actual_value);
		for(int j=0;j<arr.length;j++)
		{
			temp_value=temp_value+arr[j];
			
		}
		System.out.println("Missing element: " +(actual_value-temp_value));
		
		
		//-------------------------------------------------------------------------------------------------------
		
		System.out.println("String split string with Smaller case and upper case");
		
		String a="Hi murugan Hi murugan";
		String uc="";
		String lc="";
		
		
		int mid=a.length()/2;
		
		for(int k=0;k<a.length();k++)
		{
			if(k>mid)
			{
				uc=uc+Character.toUpperCase(a.charAt(k));
			}
			if(k<mid)
			{
				lc=lc+Character.toLowerCase(a.charAt(k));
			}
		}
		
		System.out.println("Upper case: "+uc);
		System.out.println("Lower case: "+lc);
			
		//-------------------------------------------------------------------------------------
		System.out.println("Array insert value :");
		
		int[] arrsam=new int[5];
		
		Scanner sc=new Scanner(System.in);
		for(int v=0;v<5;v++)
		{
			arrsam[v]=sc.nextInt();
		}
		
		for(int y=0;y<arrsam.length;y++)
		{
			System.out.println("Arra values:"+arrsam[y]);
		}
	
		
	}
	
	
	
	
	
	
}
