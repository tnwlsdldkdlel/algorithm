package string;

import java.util.Scanner;

public class character_search {
	
	public long solution(String str, char chr) {
		char upper_chr = Character.toUpperCase(chr);
		str = str.toUpperCase();
		return str.chars().filter( c -> c == upper_chr ).count();
	}
	
	public static void main(String[] args) {
		character_search cs = new character_search();

		Scanner scan =  new Scanner(System.in);
		String str = scan.next();
		char chr = scan.next().charAt(0); 
		
		System.out.println(cs.solution(str, chr));
		
	}

}