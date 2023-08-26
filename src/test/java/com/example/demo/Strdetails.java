package com.example.demo;

import java.util.Scanner;

public class Strdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int totalCount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		str=sc.next();
		totalCount=str.length();
				int ca=1;
		for(int i=0;i<totalCount;i++)
		{	int charCount=1;
			
			for(int j=i+1; j<totalCount;j++) {
				 if(str.charAt(i)==str.charAt(j))
				 {
					 ca=ca+1;
					 System.out.println("Char  dddd :"+str.charAt(i)+"   " +ca);
					 
				 }
				 else {
				 System.out.println("Char :"+str.charAt(i)+"   " +charCount);
				 }
			}
			
			
			
			//if(str.charAt(i)=='a')
			//{
				//charCount=charCount+1;
				//System.out.println("A char came this given intput: " +charCount);
			//}
		}
		
		System.out.println("Entered the string: "+str);
	}

}
