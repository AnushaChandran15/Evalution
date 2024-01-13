package com.anushachandran1502.evalution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		PascalTriangle triangle=new PascalTriangle();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int numRows=scanner.nextInt();
		List<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		list=triangle.pascalTriangle(numRows,list);
		System.out.println(list);
	}

	private List<ArrayList<Integer>> pascalTriangle(int numRows, List<ArrayList<Integer>> list) 
	{
		
		for(int i=0;i<numRows;i++)
		{
			ArrayList<Integer> li=new ArrayList<Integer>();
			for(int j=0;j<=i;j++)
			{
				if(j==0 || j==i)
				{
					li.add(1);
				}
				else
				{
					li.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
				}
			}
			list.add(li);
		}
		return list;
	}

}
