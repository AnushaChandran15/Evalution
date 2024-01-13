package com.anushachandran1502.evalution;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheStringIndexBased {
	
	public static void main(String[] args) {
		ReverseTheStringIndexBased reverseTheString=new ReverseTheStringIndexBased();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the input String");
		String input=scanner.nextLine();
		System.out.println("Enter the index");
		int index=scanner.nextInt();
		String output=reverseTheString.reverseTheString(input,index);
		System.out.println(output);
	}

	private String reverseTheString(String input, int index) {
		if(input.isEmpty())
		{
			return "String is Empty";
		}
		char[] chars=input.toCharArray();
		
	if(index>=0 && index<=input.length())
		{	
		int start=index;
		for(int i=input.length()-1;i>=start;i--)
		{
			char temp=chars[i];
			chars[i]=chars[start];
			chars[start]=temp;
			start++;
		}
		}	
		return new String(chars);
	}

}
