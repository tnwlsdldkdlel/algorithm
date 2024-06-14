package Array;

import java.util.Scanner;

// 피보나치 수열
// 설명 : 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다. 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
// 입력 : 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
// 출력 : 첫 줄에 피보나치 수열을 출력합니다.
public class Array4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		Array4 array4 = new Array4();
		System.out.println(array4.solution(count));
	}

	public String solution(int count) {
		int pre = 0;
		int next = 1;
		int result = 0;
		
		StringBuilder builder = new StringBuilder();
		builder.append(next + " ");
		
		for (int i = 1; i < count; i++) {
			result = pre + next;
			builder.append(result + " ");
			pre = next;
			next = result;
		}
		
		return builder.toString();
	}
}
