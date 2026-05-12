package be_study.quiz;

public class Quiz09 {

	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		for (i = 1; i <= 9; i++) {
			System.out.println(i);
		}
		for (i = 10; i <= 100; i += 10) {
			System.out.println(i);
		}
		for (i = 25; i <= 100; i += 25) {
			System.out.println(i);
		}

		i = 50;
		while (i <= 55) {
			System.out.println(i);
			i++;
		}

		i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		i = 30;
		while (i >= 0) {
			System.out.println(i);
			i -= 5;
		}

		i = 30;
		while (i >= 5) {
			System.out.println(i);
			i -= 5;
		}

		i = 25;
		while (i >= 0) {
			System.out.println(i);
			i -= 5;
		}
	}

}
