package Array;

import java.util.Scanner;

// 보이는 학생
// 설명 : 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
// 입력 : 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
// 출력 : 선생님이 볼 수 있는 최대학생수를 출력한다.
public class Array2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.valueOf(scan.next());

		int[] data = new int[count];
		for (int i = 0; i < count; i++) {
			data[i] = scan.nextInt();
		}

		Array2 array2 = new Array2();
		System.out.println(array2.solution(data));
	}

	public int solution(int[] data) {
		int result = 0;
		int max = 0;

		for (int i : data) {
			if (max < i) {
				max = i;
				result++;
			}
		}

		return result;
	}
}
