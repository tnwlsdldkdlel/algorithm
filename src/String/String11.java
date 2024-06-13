package String;

import java.util.Scanner;

// 문자열 압축
// 설명 : 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오. 단 반복횟수가 1인 경우 생략합니다. 
// 입력 : 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
// 출력 : 첫 줄에 압축된 문자열을 출력한다.
public class String11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String11 string11 = new String11();
		System.out.println(string11.solution(str));
	}
	
	public String solution(String data) {
		StringBuilder builder = new StringBuilder();
		
		for(char c : data.toCharArray()) {
			String temp = data.replaceAll(Character.toString(c), "");
			int count = data.length() - temp.length();
			
			if(builder.indexOf(Character.toString(c)) < 0) {
				builder.append(c);
				
				if(count > 1) {
					builder.append(count);
				}
			}
		}
		
		return builder.toString();
	}
}
