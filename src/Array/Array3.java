package Array;

import java.util.Scanner;

// 가위 바위 보
// 설명 : A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다. 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.  두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
// 입력 : 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다. 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다. 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
// 출력 : 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
public class Array3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.valueOf(scan.next());

		int[] a = new int[count];
		for (int i = 0; i < count; i++) {
			a[i] = scan.nextInt();
		}

		int[] b = new int[count];
		for (int i = 0; i < count; i++) {
			b[i] = scan.nextInt();
		}

		Array3 array3 = new Array3();

		for (String s : array3.solution(a, b, count)) {
			System.out.println(s);
		}
	}

	public String[] solution(int[] a, int[] b, int count) {
		String[] result = new String[count];

		for (int i = 0; i < count; i++) {
			// 1 : 가위 , 2 : 바위, 3 : 보
			String temp = "";
			switch (a[i]) {
			case 1:
				temp = b[i] == 1 ? "D" : b[i] == 2 ? "B" : "A";
				break;

			case 2:
				temp = b[i] == 2 ? "D" : b[i] == 3 ? "B" : "A";
				break;

			case 3:
				temp = b[i] == 3 ? "D" : b[i] == 1 ? "B" : "A";
				break;
			}

			result[i] = temp;
		}

		return result;
	}
}
