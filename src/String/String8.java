package String;

import java.util.Scanner;

// 유효한 팰린드롬
// 설명 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다. 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다. 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.알파벳 이외의 문자들의 무시합니다.
// 입력 : 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
// 출력 : 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
public class String8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String8 string8 = new String8();
		System.out.print(string8.solution(str));
	}
	
	public String solution(String data) {
		data = data.toUpperCase().replaceAll("[^A-Z]", "");

		String result = "NO";
		StringBuilder builder = new StringBuilder(data);
		
		if(data.equalsIgnoreCase(builder.reverse().toString())) {
			result = "YES";
		}
		
		return result;
	}
}
