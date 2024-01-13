package com.anushachandran1502.evalution;

import java.util.Scanner;

public class BallBouncingFactor {
	public static void main(String[] args) {
		BallBouncingFactor ballBouncing=new BallBouncingFactor();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Height");
		int h=scanner.nextInt();
		System.out.println("Enter the Bouncing Factor");
		float b=scanner.nextFloat();
		float distance=0;
			distance=ballBouncing.BallBouncingTotalDistance(h,b,distance);
			System.out.println(distance);
	}

	private float BallBouncingTotalDistance(int h, float b, float distance) {
		distance=0;
		distance+=h;
		System.out.println(distance);
		float bouncing=h;
		do
		{
			bouncing/=2;
			distance+=bouncing+bouncing;
			System.out.println(distance +" "+bouncing);
		}
		while(bouncing>1);
		
		return distance;
	}

}
