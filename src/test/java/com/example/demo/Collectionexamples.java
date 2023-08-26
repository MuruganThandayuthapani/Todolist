package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Collectionexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList <String> list= new ArrayList<String>();
		list.add("ram");
		list.add("mohan");
		Iterator<String> iii=list.iterator();             
		
		while(iii.hasNext())
		{
			System.out.println(iii.next());
		}
		

	}

}
