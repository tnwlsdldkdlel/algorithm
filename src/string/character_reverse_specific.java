package string;

import java.util.Scanner;

public class character_reverse_specific {

	public String solution(String str) {
		char [] arr_c = str.toCharArray();
		int i = 0;
		int length = str.length()-1;
		
		for(char c : arr_c) {
			boolean check = Character.isAlphabetic(c);
			
			// 중간까지만 체크
			if(i <= length/2) {
				// 문자인 경우에만 뒤집기
				if(check == true) {
					char temp = arr_c[length-i];
					arr_c[i] = temp;
					arr_c[length-i] = c;
				}	
			}
			
			i++;
		}
		
		return new String(arr_c);
	}

	public static void main(String[] args) {
		character_reverse_specific crs = new character_reverse_specific();
		Scanner scan = new Scanner(System.in);
		
		System.out.println(crs.solution(scan.next()));
	}

}