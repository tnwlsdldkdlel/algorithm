package Array;

import java.util.Scanner;

// 격자판 최대합
// 설명 : 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
// N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
// 입력 : 첫 줄에 자연수 N이 주어진다.(2<=N<=50) 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
// 출력 : 최대합을 출력합니다.
public class Array9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		int[][] data = new int[count][count];
		for (int x = 0; x < count; x++) {
			for (int y = 0; y < count; y++) {
				data[x][y] = scan.nextInt();
			}
		}

		Array9 array9 = new Array9();
		System.out.println(array9.solution(count, data));
	}

	public int solution(int count, int[][] data) {
		int target = 0;

		// 각열과 행의 합
		for (int x = 0; x < count; x++) {
			int result1 = 0;
			int result2 = 0;

			for (int y = 0; y < count; y++) {
				result1 += data[x][y];
				result2 += data[y][x];
			}

			target = Math.max(target, result1);
			target = Math.max(target, result2);
		}

		// 두 대각선의 합
		int result3 = 0;
		int result4 = 0;
		for (int x = 0; x < count; x++) {
			result3 += data[x][x];
			result4 += data[x][(count - 1) - x];

			target = Math.max(target, result3);
			target = Math.max(target, result4);
		}

		return target;
	}
}
