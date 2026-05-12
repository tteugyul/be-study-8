package be_study.quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		int gea;
		System.out.print("출생년도를 입력하세요 : ");
		age = sc.nextInt();
		int ageR = 2026 - age + 1;
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		gea = sc.nextInt();
		if (0 <= age && age <= 2027 && 1 <= gea && gea <= 4) {
			if (age >= 2000 && gea == 3) {
				System.out.println("결과 : " + ageR + "살 " + "남자입니다.");
			} else if (age < 1999 && gea == 1) {
				System.out.println("결과 : " + ageR + "살 " + "남자입니다.");
			} else if (age >= 2000 && gea == 4) {
				System.out.println("결과 : " + ageR + "살 " + "여자입니다.");
			} else if (age < 1999 && gea == 2) {
				System.out.println("결과 : " + ageR + "살 " + "여자입니다.");
			} else {
				System.out.println("잘못된 입력");
			}
		} else {
			System.out.println("잘못된 입력");
		}
	}

}
