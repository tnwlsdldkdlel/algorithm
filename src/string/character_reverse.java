package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class character_reverse {

	public List<String> solution(String[] str) {
		List<String> result = new ArrayList<String>();
		
		for(String s : str) {
			StringBuffer sb = new StringBuffer(s).reverse();
			result.add(sb.toString()); 
		}
		
		return result;
	}

	public static void main(String[] args) {
		character_reverse cs = new character_reverse();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String [] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = scan.next();
		}

		cs.solution(str).forEach(l -> System.out.println(l));
	}

}