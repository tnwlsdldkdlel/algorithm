package String;

import java.util.Scanner;

// 회문 문자열
// 설명 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다. 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다. 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
// 입력 : 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
// 출력 : 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
public class String7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String7 string7 = new String7();
		System.out.println(string7.solution(str));
	}

//	public String solution(String data) {
//		char[] dataArr = data.toLowerCase().toCharArray();
//		String result = "YES";
//		int index = 0;
//		
//		for(char c : dataArr) {
//			if(c != dataArr[(dataArr.length - 1) - index]) {
//				return "NO";
//			}
//			
//			index ++;
//		}
//		
//		return result;
//	}
	
	public String solution(String data) {
		StringBuilder builder = new StringBuilder(data);
		String result = "NO";
		
		if(data.equalsIgnoreCase(builder.reverse().toString())) {
			result = "YES";
		}
		
		return result;
	}
}
