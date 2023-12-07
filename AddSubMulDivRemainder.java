package com.javalec.function;

public class AddSubMulDivRemainder extends AddSubMulDiv {
/*
	Description : AddSubMulDiv로부터 상속받아 덧셈 + 뺼셈 + 곱셈 + 나눗셈 + 나머지를 출력하는 프로그램 
	Date : 23.12.07
	Version : 1.0 
	Author : 강인기
 */
	
	
	// Field
	int remainder; // 나머지값 변수
	
	
	
	
	
	// Constructor
	public AddSubMulDivRemainder() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void remainder(int num1, int num2, int num4) { // 입력값 3개를 받아옴 
		remainder = num1 % num2 % num4; // 입력받은 3숫자의 나머지값을 구한다
		
		System.out.println((double)remainder); 
		
	}

}
