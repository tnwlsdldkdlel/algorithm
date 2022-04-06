package string;

import java.util.Scanner;

public class character_remove_duplicate {

	public String solution(String str) {
		
		String result = "";
		char [] char_arr = str.toCharArray();
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			// indexOf : str 앞에서부터 찾아
			if(str.indexOf(str.charAt(i))== i) {
				result += str.charAt(i);
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		character_remove_duplicate crd = new character_remove_duplicate();
		Scanner scan = new Scanner(System.in);
		
		System.out.println(crd.solution(scan.next()));
	}

}