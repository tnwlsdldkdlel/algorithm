package Array;

import java.util.Scanner;

// 큰 수 출력하기
// 설명 : N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.(첫 번째 수는 무조건 출력한다)
// 입력 : 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
// 출력 : 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
public class Array1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.valueOf(scan.next());

		int[] data = new int[count];
		for (int i = 0; i < count; i++) {
			data[i] = scan.nextInt();
		}

		Array1 array1 = new Array1();
		System.out.println(array1.solution(data));
	}

	public String solution(int[] data) {
		StringBuilder builder = new StringBuilder();

		builder.append(data[0] + " ");
		for (int i = 1; i < data.length; i++) {
			if (data[i - 1] < data[i]) {
				builder.append(data[i] + " ");
			}
		}

		return builder.toString();
	}
}
