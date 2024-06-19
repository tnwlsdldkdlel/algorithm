package twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

// 연속 부분수열
// 설명 : N개의 수로 이루어진 수열이 주어집니다.
// 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
// 만약 N=8, M=6이고 수열이 다음과 같다면
// 1 2 1 3 1 1 1 2
// 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
// 입력 : 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
// 수열의 원소값은 1,000을 넘지 않는 자연수이다.
// 출력 : 수열의 원소값은 1,000을 넘지 않는 자연수이다.
public class twoPointer_slidingWindow4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		ArrayList<Integer> data = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			data.add(scan.nextInt());
		}

		twoPointer_slidingWindow4 slidingWindow4 = new twoPointer_slidingWindow4();
		System.out.println(slidingWindow4.solution(data, m));
	}

	public int solution(ArrayList<Integer> data, int m) {
		int result = 0;
		int left = 0;
		int sum = 0;

		for (int right = 0; right < data.size(); right++) {
			// 점진적으로 더하다가
			sum += data.get(right);

			// 합이 특정숫자보다 클 경우 더 더할필요없으므로 가장 왼쪽의 데이터를 삭제한다.
			while (sum > m) {
				sum -= data.get(left);
				left++;
			}

			// 그러다가 합이 특정숫자가 나오면 카운팅
			if (sum == m) {
				result++;
			}
		}

		return result;
	}
}
