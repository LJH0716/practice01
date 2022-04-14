package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		/*double f = 80.0;
		System.out.println(5/9*(f-32.0)); 
		*/
		
		//5/9는 정수값으로 0이 나오기 때문 --> 5나 9에 실수 처리 해줘야함
		
		double f = 80.0;
		System.out.println((double) 5/9*(f-32.0)); 
		
	}
}
