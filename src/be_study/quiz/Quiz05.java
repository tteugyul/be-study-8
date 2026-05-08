package be_study.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번. num 값을 확인하여 "양수" "음수" "0" 이라고 출력하도록 코드를 작성하세요.
		int num = 10;
		System.out.println((num >= 0) ? "양수" : (num == 0) ? "0" : "음수");

		// 2번. 아래와 같이 프로그램이 진행되면서 숫자 2개를 입력받고 각각의 결과를 출력하세요.
		// ㅇ 모양은 사용자가 입력한 숫자와 계산된 결과입니다.
		// 나누기 결과는 소수점을 포함하여 나타나도록 해주세요.
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int a = scanner.nextInt();
		System.out.println("입력한 숫자 : " + a);
		System.out.print("두번쨰 숫자를 입력하세요 : ");
		int b = scanner.nextInt();
		System.out.println("입력한 숫자 : " + b);
		int qo = a + b;
		int wo = a - b;
		int eo = a * b;
		double ro = (double) a / b;
		System.out.println("두 숫자를 더한 값은 : " + qo);
		System.out.println("두 숫자를 뺀 값은 : " + wo);
		System.out.println("두 숫자를 곱한 값은 : " + eo);
		System.out.println("두 숫자를 나눈 값은 : " + ro);
	}

}
