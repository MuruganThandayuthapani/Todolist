package com.example.demo;

public class Arrayuseage {
 public static void main(String args[])
 {
	 int a[]= {10,20,30,30,40,50,10};
	 int aa=0,bb=0,arraycount=0;
	 int arraylenth=a.length;
	 
	 for(int i =0;i<arraylenth;i++)
	 {
		 if(a[i]>30)
		 {
			 arraycount=arraycount+1; 
		 }
		 System.out.println(a[i]);
		 
		 if(i%2==0)
		 {
			aa=aa+a[i];
		 }
		 else
		 {
			 bb=bb+a[i];
		 }
		 
	 }
	 
	 System.out.println("Sum of even numbers: " +aa);
	 System.out.println("Sum of odd numbers: " +bb);
	 System.out.println("Revers print");
	 
	 for(int j =arraylenth-1;j>=0;j--)
	 {
		 System.out.println(a[j]);
	 }
	  
	 int c= arraylenth%2;
	 
	 if(c==0)
	 {
		 System.out.println("we can able to find the center value");
	 }
	 else
	 {
		 System.out.println("Center number is: " +a[(arraylenth/2)]);
	 }
	 
	 if(aa>bb)
	 {
		 System.out.println("big number is Even: "+aa);
		 System.out.println("ans"+(aa-bb));
	 }
	 else
	 {
		 System.out.println("big number is Odd: "+bb);
		 System.out.println("ANS: "+(bb-aa));
	 }
	 
	 
	 System.out.println("above 30 "+arraycount + " numbers are there");
 }
 	
}
