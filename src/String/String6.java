package String;

import java.util.Scanner;

// 중복문자제거
// 설명 : 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
// 입력 : 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
// 출력 : 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
public class String6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String6 string6 = new String6();
		System.out.println(string6.solution(str));
	}

	public String solution(String data) {
		char[] charArr = data.toCharArray();
		StringBuilder builder = new StringBuilder();

		for (char c : charArr) {
			if (builder.indexOf(String.valueOf(c)) < 0) {
				builder.append(c);
			}
		}
		
		return builder.toString();
	}
}
