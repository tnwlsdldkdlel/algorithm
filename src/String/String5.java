package String;

import java.util.Scanner;

// 특정 문자 뒤집기
// 설명 : 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
// 입력 : 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
// 출력 : 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
public class String5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String5 string5 = new String5();
		System.out.println(string5.solution(str));
		
	}
	
	public String solution(String data) {
		char[] dataArr = data.toCharArray();
		char[] resultArr = dataArr.clone();
		
		for(char c: data.toCharArray()) {
			int i = 0;
			System.out.println(c);
			System.out.println(i);
			if(Character.isLetter(c)) {
				resultArr[dataArr.length-1-i] = c;
			} else {
				resultArr[i] = c;
			}
		}

		StringBuilder builder = new StringBuilder();
		builder.append(resultArr);
		
		return builder.toString();
	}
}
