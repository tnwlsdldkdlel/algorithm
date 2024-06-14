package Array;

import java.util.Scanner;

// 소수(에라토스테네스 체)
// 설명 : 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요. 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
// 입력 : 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
// 출력 : 첫 줄에 소수의 개수를 출력합니다.
public class Array5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		Array5 array5 = new Array5();
		System.out.println(array5.solution(count));
	}

	public int solution(int count) {
		Boolean[] check = new Boolean[count + 1];
		int result = 0;

		// 0과 1은 소수가 아니다.
		check[0] = check[1] = false;

		// 배열 초기화
		for (int i = 2; i <= count; i++) {
			check[i] = true;
		}

		// 소수 판별
		for (int i = 2; i * i <= count; i++) {
			if (check[i]) {
				for (int j = i * i; j <= count; j += i) {
					check[j] = false;
				}
			}
		}

		// 소수 세기
		for (int i = 0; i <= count; i++) {
			if (check[i]) {
				result++;
			}
		}
		
		return result;
	}
}
