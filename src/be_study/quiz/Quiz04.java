package be_study.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int result1;
//		System.out.print("밑변을 입력하세요 : ");
//		int a = scanner.nextInt();
//		System.out.print("높이를 입력하세요 : ");
//		int b = scanner.nextInt();
//
//		result1 = (a * b) / 2;
//		System.out.println("삼각형의 넓이는 " + result1);
//
//		int result2;
//		System.out.print("윗변을 입력하세요 : ");
//		a = scanner.nextInt();
//		System.out.print("밑변을 입력하세요 : ");
//		b = scanner.nextInt();
//		System.out.print("높이를 입력하세요 : ");
//		int c = scanner.nextInt();
//		result2 = ((a + b) * c) / 2;
//		System.out.println("사다리꼴의 넓이는 " + result2);
//
//		int student = 24;
//		int snack = 100;
//		int happySnack = snack / student;
//		int sadSnack = snack % student;
//		System.out.println("학생들이 과자를 받는 개수는 : " + happySnack + "\n남는 과자의 개수는 : " + sadSnack);

//		System.out.print("세 자리의 정수를 입력하세요 : ");
//		int num = scanner.nextInt();
//		System.out.println("백의 자리 숫자 : " + num / 100);
//		System.out.println("십의 자리 숫자 : " + (num / 10) % 10);
//		System.out.println("일의 자리 숫자 : " + num % 10);

//		int x = 10;
//		int y = 20;
//		System.out.println("x=" + x + " y=" + y);
//
//		int z = x;
//		x = y;
//		y = z;
//		System.out.println("x=" + x + " y=" + y);

		int x = 2;
		int y = 3;
		int z;
		System.out.println("x=" + x + " y=" + y);
		System.out.println(x + y);
		System.out.println(x++ + y++);
		System.out.println("x=" + x + " y=" + y);
		z = ++x + ++y;
		System.out.println("x=" + x + " y=" + y);
		z--;
		x += --y;
		System.out.println("x=" + x + " y=" + y + " z=" + z);
		x = 10;
		z = x / y++;
		System.out.println("x=" + x + " y=" + y + " z=" + z);
		System.out.println("x=" + (x * 2) + " y=" + ++y + " z=" + z);
		System.out.println("x=" + x + " y=" + y + " z=" + z);

	}

}
