package twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

// 최대 매출
// 설명 : 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
// 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
// 12 1511 20 2510 20 19 13 15
// 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
// 여러분이 현수를 도와주세요.
// 입력 : 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
// 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
// 출력 : 첫 줄에 최대 매출액을 출력합니다.
public class twoPointer_slidingWindow3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // n일 동안의 매출기록
		int k = scan.nextInt(); // 연속된 k일 동안

		ArrayList<Integer> data = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			data.add(scan.nextInt());
		}

		twoPointer_slidingWindow3 window1 = new twoPointer_slidingWindow3();
		System.out.println(window1.solution(data, k));
	}

	public int solution(ArrayList<Integer> data, int k) {
		int result = 0;

		// 첫 기준이 될 구간의 합 구하기
		for (int i = 0; i < k; i++) {
			result += data.get(i);
		}

		// 첫 k일의 매출합 초기화
		int maxSum = result;

		// 기존구간에서 이제 하나씩 늘려가는데 맨 왼쪽의 값은 없어지게 되고, 맨 오른쪽의 값에는 새로운 값이 생기게 된다.
		// 그러므로, 첫 기준이 될 구간의 합(maxSum) - 맨 왼쪽의값(i - k) + 새로운 값(i)
		for (int i = k; i < data.size(); i++) {
			maxSum = maxSum - data.get(i - k) + data.get(i);

			// target값이 result보다 큰지 확인
			result = Math.max(maxSum, result);
		}

		return result;
	}
}
