package be_study.iter;

public class Iter03 {

	public static void main(String[] args) {

		// 반복문 중첩

		// 삼항 ? (참) : (거짓)
		// 삼함 ? (참) : (삼항 ? (참) : (거짓))

		// if()
		// if() {
		// if()
		// }

		for (int i = 1; i <= 5; i++) {

			// 실행문
			System.out.println("for i 실행문 : " + i);

			for (int j = 1; j <= 3; j++) {
				System.out.println("내부 for j 실행문 : " + j);
			}

			System.out.println("---for i 실행문 한 사이클 종료---");
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 1; k <= 2; k++) {

				}
			}
		}

		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "번 방 청소");

			for (int j = 1; j <= 3; j++) {
				System.out.println("쓸기");
			}

			int k = 1;
			while (k <= 2) {
				System.out.println("닦기");
				k++;
			}

			System.out.println("쓰레기 정리");
		}
	}

}
