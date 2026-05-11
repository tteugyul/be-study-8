package be_study.quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~24의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0 && num < 25) {
			if (num >= 1 && num <= 6) {
				System.out.println("오전입니다.");
				System.out.println("이른 오전입니다.");
			} else if (num >= 7 && num <= 12) {
				System.out.println("오전입니다.");
				System.out.println("늦은 오전입니다.");
			} else if (num > 12 && num <= 18) {
				System.out.println("오후입니다.");
				System.out.println("이른 오후입니다.");
			} else {
				System.out.println("오후입니다.");
				System.out.println("늦은 오후입니다.");
			}
		} else {
			System.out.println("잘못된 값");
		}

		int diceNum = 3; // 주사위수 1~6
		if (diceNum == 1) {
			System.out.println("1");
		} else if (diceNum == 2) {
			System.out.println("2");
		} else if (diceNum == 3) {
			System.out.println("3");
		} else if (diceNum == 4) {
			System.out.println("4");
		} else if (diceNum == 5) {
			System.out.println("5");
		} else {
			System.out.println("6");
		}

		String localNum = "031";
		switch (localNum) {
		case "031":
			System.out.println("경기도입니다.");
			break;
		case "02":
			System.out.println("서울입니다.");
			break;
		case "041":
			System.out.println("충남입니다.");
			break;
		case "051":
			System.out.println("부산입니다.");
			break;
		}

		int score = 99;
		switch (score) {
		case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90:
			System.out.println("학점 A");
			break;
		case 89, 88, 87, 86, 85, 84, 83, 82, 81, 80:
			System.out.println("학점 B");
			break;
		case 79, 78, 77, 76, 75, 74, 73, 72, 71, 70:
			System.out.println("학점 C");
			break;
		default:
			System.out.println("학점 F");
			break;
		}
	}
}
