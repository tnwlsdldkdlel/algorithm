package string;

import java.util.Scanner;

public class character_word_in_str {

	public String solution(String str) {

		String[] list = str.split(" ");
		int i = 0;
		String long_str = "";

		for (String list_str : list) {
			int length = list_str.length();

			if (length > i) {
				i = length;
				long_str = list_str;
			}

		}
		return long_str;
	}

	public static void main(String[] args) {
		character_case_conversion cs = new character_case_conversion();

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine(); // 중요!

		System.out.println(cs.solution(str));

	}

}