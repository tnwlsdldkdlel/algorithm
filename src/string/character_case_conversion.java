package string;

import java.util.Scanner;

public class character_case_conversion {
	
	public String solution(String str) {
		
		String result = "";
		for(char c : str.toCharArray() ) {
			if(Character.isUpperCase(c)) {
				result += Character.toLowerCase(c);
			}else {
				result += Character.toUpperCase(c);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		character_case_conversion cs = new character_case_conversion();

		Scanner scan =  new Scanner(System.in);
		String str = scan.next();
		
		System.out.println(cs.solution(str));
		
	}

}