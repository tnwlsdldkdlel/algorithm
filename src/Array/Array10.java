package Array;

import java.util.Scanner;

// 봉우리
// 설명 : 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
// 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
// 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
// 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
// 입력 : 첫 줄에 자연수 N이 주어진다.(2<=N<=50) 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
// 출력 : 봉우리의 개수를 출력하세요.
public class Array10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		int[][] data = new int[count + 1][count + 1];
		for (int x = 0; x <= count; x++) {
			for (int y = 0; y <= count; y++) {
				if (x == 0 || y == 0) {
					data[x][y] = 0;
				} else {
					data[x][y] = scan.nextInt();
				}
			}
		}

		Array10 array10 = new Array10();
		System.out.println(array10.solution(count, data));
	}

	public int solution(int count, int[][] data) {
		int result = 0;

		for (int x = 1; x < count; x++) {
			int result1 = 0;
			int result2 = 0;
			int result3 = 0;
			int result4 = 0;
			int target = 0;
			int target2 = 0;

			for (int y = 1; y < count; y++) {
				target = data[x][y];
				target2 = data[y][x];

				result1 = data[x][y - 1];
				result2 = data[x - 1][y];
				result3 = data[x][y + 1];
				result4 = data[x + 1][y];

				if (target > result1) {
					if (target > result2) {
						if (target > result3) {
							if (target > result4) {
								result++;
							}
						}
					}
				}
				
				if (target2 > result1) {
					if (target2 > result2) {
						if (target2 > result3) {
							if (target2 > result4) {
								result++;
							}
						}
					}
				}
			}
		}

		return result;
	}
}
