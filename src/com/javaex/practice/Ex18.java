package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: ");
		double F = sc.nextDouble();
		
		System.out.print("화씨 " +F+" 의 섭씨온도는 " +5.0/9.0 *(F-32)+" 입니다.");
		
		
		
		
		sc.close();
	}
}
