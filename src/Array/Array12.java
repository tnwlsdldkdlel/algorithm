package Array;

import java.util.Scanner;

// 멘토링
// 설명 : 현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.
// 멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.
// 선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
// 만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.
// M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.
// 입력 : 첫 번째 줄에 반 학생 수 N(1<=N<=20)과 M(1<=M<=10)이 주어진다.
// 두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다.
// 만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2로 입력되었다면 3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.
// 둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다.
// 주어지는 정수는 모두 1 이상 9 이하의 정수이다.
// 출력 : 첫 번째 줄에 짝을 만들 수 있는 총 경우를 출력합니다.
// 힌트 : (3, 1), (3, 2), (4, 2)와 같이 3가지 경우의 (멘토, 멘티) 짝을 만들 수 있다.
public class Array12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 학생 수
		int m = scan.nextInt(); // 수학 테스트 진행한 횟수

		int[][] data = new int[m][n];
		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				data[x][y] = scan.nextInt();
			}
		}

		Array12 array12 = new Array12();
		System.out.println(array12.solution(m, n, data));
	}

	public int solution(int m, int n, int[][] data) {
		int[][] result = new int[n][n];
		int count = 0;

		// 어쩌피 등수에 따라 순서가 정해져있으니까 해당 x와 y인 경우 카우팅
		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				for (int z = y + 1; z < n; z++) {
					int x1 = data[x][y] - 1;
					int y1 = data[x][z] - 1;

					result[x1][y1]++;

					// 마지막인경우 카운팅
					if (x == m - 1) {
						if (result[x1][y1] == m) {
							count++;
						}
					}
				}
			}
		}

		return count;
	}
}
