package String;

import java.util.Scanner;

// 문자열 찾기
public class String1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next().toLowerCase();
		String1 test = new String1();
		char target = Character.toLowerCase(scan.next().charAt(0));	
		
		System.out.println(test.solution(str, target));
	}

	public long solution(String str, char target) {
		if (str.length() < 100) {
			long result = str
					.chars()
					.filter(c -> c == target)
					.count();
			return result;
		} else {
			System.out.println("글자 길이 제한 100글자.");
			return 0;
		}
	}
}
