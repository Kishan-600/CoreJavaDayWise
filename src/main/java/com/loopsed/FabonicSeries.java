package com.loopsed;

import java.util.Scanner;

public class FabonicSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int x=0,y=1,z=0;
		while(z<=n) 
		{
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
		}

	}

}
