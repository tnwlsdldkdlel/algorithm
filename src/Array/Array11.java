package Array;

import java.util.Scanner;

// 임시반장 정하기
//설명 : 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
// 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
// 그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
// 그래서 김갑동 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표를 만들었다.
// 예를 들어 학생 수가 5명일 때의 표를 살펴보자.
// 위 경우에 4번 학생을 보면 3번 학생과 2학년 때 같은 반이었고, 3번 학생 및 5번 학생과 3학년 때 같은 반이었으며,
// 2번 학생과는 4학년 때 같은 반이었음을 알 수 있다. 그러므로 이 학급에서 4번 학생과 한번이라도
// 같은 반이었던 사람은 2번 학생, 3번 학생과 5번 학생으로 모두 3명이다.
// 이 예에서 4번 학생이 전체 학생 중에서 같은 반이었던 학생 수가 제일 많으므로 임시 반장이 된다.
// 각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에는 반의 학생 수를 나타내는 정수가 주어진다. 학생 수는 3 이상 1000 이하이다.
// 둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다.
// 주어지는 정수는 모두 1 이상 9 이하의 정수이다.
// 출력 : 주어지는 정수는 모두 1 이상 9 이하의 정수이다.
// 단, 임시 반장이 될 수 있는 학생이 여러 명인 경우에는 그 중 가장 작은 번호만 출력한다.
public class Array11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		int[][] data = new int[count][5];
		for (int x = 0; x < count; x++) {
			for (int y = 0; y < 5; y++) {
				data[x][y] = scan.nextInt();
			}
		}

		Array11 array11 = new Array11();
		System.out.println(array11.solution(count, data));
	}

	public int solution(int count, int[][] data) {
		int result = Integer.MIN_VALUE; // 같은반을 가장 많이한 학생
		int max = 0; // 중복된 데이터중 가장 큰 수

		for (int x = 0; x < count; x++) {
			int n = 0; // 중복된 데이터 카운팅

			for (int y = 0; y < count; y++) {
				// 자기 자신(data[y][x])을 제외하고 반복해서 중복된 데이터를 찾는다.
				for (int z = 0; z < 5; z++) {
					if (y != z) {
						// 중복된 데이터를 찾았으면 카운팅을 해주는데 해당 학생의 번호를 기억해둔다.
						if (data[x][z] == data[y][z]) {
							n++;
							break;
						}
					}
				}

				// 각 학생의 카운팅 수를 비교한다.
				if (n > max) {
					max = n;
					result = x;
				}
			}

		}

		return result + 1;
	}
}
