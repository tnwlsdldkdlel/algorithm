package Array;

import java.util.Scanner;

// 뒤집은 소수
// 설명 : N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요. 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다. 첫 자리부터의 연속된 0은 무시한다.
// 입력 : 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다. 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
// 출력 : 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
public class Array6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.valueOf(scan.next());

		String[] data = new String[count];
		for (int i = 0; i < count; i++) {
			data[i] = scan.next();
		}

		Array6 array6 = new Array6();
		System.out.println(array6.solution(count, data));
	}

	public String solution(int count, String[] data) {
		StringBuilder result = new StringBuilder();

		for (String target : data) {
			// 뒤집고 int로 변경
			StringBuilder builder = new StringBuilder();
			target = builder.append(target).reverse().toString();
			int intTarget = Integer.parseInt(target);

			// 소수인지판별
			Boolean flag = false;
			if (intTarget != 1 && intTarget != 0) {
				for (int i = 2; i < intTarget; i++) {
					if (intTarget % i == 0) {
						flag = true;
						break;
					}
				}
			} else {
				flag = true;
			}

			if (!flag) {
				result.append(intTarget + " ");
			}
		}

		return result.toString();
	}
}
