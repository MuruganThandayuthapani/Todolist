package com.example.demo;

import java.util.Arrays;

public class ArrayAssendening {

	public static void main(String[] args) {
		int arr[]= {1,7,6,3,9,5,12,11,2};
		int a=0;
		int b=0;
		int cen=0;
		
		
		System.out.println("given array");
		for(int e=0;e<arr.length;e++)

		{
			System.out.print(arr[e]);
		}
		
		Arrays.parallelSort(arr);
		System.out.println("\n order by");
		for(int i =0;i<arr.length;i++)
			
		{
			System.out.print(arr[i]+",");
			
			
			
		
			
				if(arr[i]%2==0) 
				{
					a=a+arr[i];
				}
				if(arr[i]%2!=0)
				{
					b=b+arr[i];
				}
			
			
			if(i==(arr.length/2))
			{
				cen=arr[i];
			}
			
		}
		System.out.println("");
		System.out.println("ood Index total : "+a);
		System.out.println("Even Index total : "+b);
		System.out.print("Center number: "+cen);
		
		
		
			
	}

}
