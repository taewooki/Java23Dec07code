package com.javalec.function;

public class AddSubMul extends AddSub {

	
	/*
	 *  메인에서 받은 숫자를 이용하여 곱셈을 하여 다시 메인으로 보내기
	 *  Date : 2023.12.07.목요일
	 *  Version : 1.0
	 *  Author : 강범식
	 */
	
	
	
	// Field


	// constructor

	public AddSubMul() {						

	}
	
	public int AddSubMul(int num1, int num2) {									//2개를 입력받으면 2개를 곱해지는 식
		
		return num1*num2;
	}
	
	public int AddSubMul(int num1, int num2,int num3) {							//3개를 입력받으면 3개를 곱해지는 
		
		return num1*num2*num3;
	}
	

	// Method

	public int AddSumMulresult() {													//숫자 3개를 입력받고 Method 에서 곱셈하여 다시 메인으로 보내기
			return  ( num1*num2*num4);
			
			
			}

}
