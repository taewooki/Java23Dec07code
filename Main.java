package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.AddSubMulDivRemainder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1을 입력하세요 : ");
		int num1 = sc.nextInt();

		System.out.print("숫자 2을 입력하세요 : ");
		int num2 = sc.nextInt();

		System.out.print("숫자 3을 입력하세요 : ");
		int num3 = sc.nextInt();

		System.out.print("숫자 4을 입력하세요 : ");
		int num4 = sc.nextInt();

		AddSubMulDivRemainder calc = new AddSubMulDivRemainder();
		calc.num1 = num1;
		calc.num2 = num2;
		calc.num3 = num3;
		calc.num4 = num4;

		System.out.println(">>> Feild를 사용");
		System.out.println("1. " + num1 + "과 " + num2 + "의 숫자 합은 " + (calc.num1 + calc.num2) + "입니다.");
		System.out.println("2. " + num1 + "과 " + num3 + ", " + num4 + "의 *덧셈 뺄셈 곱셈 나눗셈* 의 결과는 ");
		System.out.println("덧셈 : " + (calc.num1 + calc.num3 + calc.num4));
		System.out.println("뺄셈 : " + (calc.num1 - calc.num3 - calc.num4));
		System.out.println("곱셈 : " + (calc.num1 * calc.num3 * calc.num4));
		System.out.println("나눗셈 : " + (calc.num1 / calc.num3 / calc.num4));
		System.out.println("---------------------------------------------------------------------");

		System.out.println(">>> Constuctor를 사용");
		System.out.println("1. " + num3 + "과 " + num4 + "번의 *덧셈, 뺄셈, 곱셈* 의 결과는 ");
		System.out.println("덧셈 : " + calc.Add(num3, num4));
		System.out.println("뺄셈 : " + calc.AddSub(num3, num4));
		System.out.println("곱셈 : " + calc.AddSubMul(num3, num4));

		System.out.println("2. " + num1 + ", " + num2 + ", " + num3 + "의 *뺄셈과 곱셈* 의 결과는");
		System.out.println("뺄셈 : " + calc.AddSub(num1, num2, num3));
		System.out.println("곱셈 : " + calc.AddSubMul(num1, num2, num3));
		System.out.println("---------------------------------------------------------------------");

		System.out.println(">>> Method를 사용");
		System.out.println("1. " + num1 + "," + num2 + "," + num4 + "의 *덧셈, 뺄셈, 곱셈, 나눗셈, 나머지*의 결과는");
		System.out.println("덧셈: " + calc.addResult());
		System.out.println("뺄셈: " + calc.AddSubResult1());
		System.out.println("곱셈: " + calc.AddSumMulresult());
		System.out.print("나눗셈: ");
		calc.div(num1, num2, num4);
		System.out.print("나머지 : ");
		calc.remainder(num1, num2, num4);

		System.out.println("2. " + num2 + "번과 " + num4 + "번의 *뺄셈과 나눗셈* 의 결과는");
		System.out.println("뺄셈 : " + calc.AddSubResult2());
		System.out.print("나눗셈 : ");
		calc.div(num2, num4);
		System.out.println("---------------------------------------------------------------------");

	


	}

}
