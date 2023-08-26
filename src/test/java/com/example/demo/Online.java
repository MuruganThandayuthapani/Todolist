package com.example.demo;

import java.util.Scanner;

public class Online {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int MAX_CHAR = 256;
		
		int count[] = new int[MAX_CHAR];
		
		String str;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		str=sc.next();
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
        
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
            	if (str.charAt(i) == ch[j])
                    find++;
            }
            
            if (find == 1)
                System.out.println(
                    "Number of Occurrence of "
                    + str.charAt(i)
                    + " is:" + count[str.charAt(i)]);
        }
            }

	}

