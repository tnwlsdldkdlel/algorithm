package String;

import java.util.Scanner;

// 대소문자변환
public class String2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		String2 string2 = new String2();
		System.out.println(string2.solution(str));
	}
	
	public String solution(String str) {
		StringBuilder builder = new StringBuilder();
		
		for(char c : str.toCharArray()) {
			if(c == Character.toUpperCase(c)) {
				builder.append(Character.toLowerCase(c));
			} else {
				builder.append(Character.toUpperCase(c));
			}
		}
		
		return builder.toString();
	}
}
