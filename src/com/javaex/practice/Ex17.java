package com.javaex.practice;

import java.util.Scanner;

	public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		
		 
		final double pi = 3.14;
		double r = sc.nextDouble();
				
		
		System.out.print("구의부피는: " +4.0/3 * pi * r*r*r+" 입니다.");
		
		
		
		
		sc.close();
		
	}
}
