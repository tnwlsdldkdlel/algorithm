package twoPointer_slidingWindow;

import java.util.Scanner;

// 연속된 자연수의 합
// 설명 : N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
// 만약 N=15이면
// 7+8=15
// 4+5+6=15
// 1+2+3+4+5=15
// 와 같이 총 3가지의 경우가 존재한다.
// 입력 : 와 같이 총 3가지의 경우가 존재한다.
// 출력 : 첫 줄에 총 경우수를 출력합니다.
public class twoPointer_slidingWindow5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		twoPointer_slidingWindow5 slidingWindow5 = new twoPointer_slidingWindow5();
		System.out.println(slidingWindow5.solution(n));
	}

	public int solution(int m) {
		int result = 0;
		int sum = 1;
		int start = 1;
		int end = 2;

		while (end < m) {
			// 해당 합보다 작은 경우 계속 더하기
			if (sum < m) {
				sum += end;
				end++;
				// 해당 합인 경우 result 카운팅
			} else if (sum == m) {
				result++;
				sum += end;
				end++;
			} else {
				sum -= start;
				start++;
			}
		}

		return result;
	}
}
