package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner wow = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int mom = wow.nextInt();
		if (mom % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		if (mom % 7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("아닙니다");
		}

		int sum = 0;
		int num = 0;
		if (0 <= num && num <= 1000) {
			for (num = 0; num <= 1000; num += 5) {
				sum += num;
			}
			System.out.println(sum);
		}

		System.out.print("입력 : ");
		int star = wow.nextInt();
		if (star >= 1 && star <= 50) {
			for (int i = 1; i <= star; i++) {
				System.out.print("*");
			}
		}
		System.out.println();

		int evenSum = 0;
		int oddSum = 0;
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		sum = evenSum - oddSum;
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += i;
			if (sum >= 1000) {
				break;
			}
		}
		System.out.println(sum);

		System.out.print("입력 ");
		int dog = wow.nextInt();
		sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum = dog * i;
			System.out.println(dog + " * " + i + " = " + sum);
			sum = 0;
		}
	}

}
