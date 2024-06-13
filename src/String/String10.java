package String;

import java.util.Scanner;

// 가장 짧은 문자거리
// 설명 : 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
// 입력 : 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다. 문자열의 길이는 100을 넘지 않는다.
// 출력 : 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
public class String10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next().toLowerCase();
		char c = Character.toLowerCase(scan.next().charAt(0));
		
		String10 string10 = new String10();
		int[] result = string10.solution(str, c);
		
		for(int i : result) {
			System.out.print(i + " ");
		}
	}
	
	public int[] solution(String data, char target) {
		// 좌측으로 부터 target과 가까운 거리 구하기.
		int len = 0;
		int answerIndex = 0;
		int[] answer = new int[data.length()];
		
		for(char c : data.toCharArray()) {
			if(c == target) {
				len = 0;
			} else {
				len ++;
			}
			
			answer[answerIndex] = len;
			answerIndex++;
		}
		
		// 우측으로 부터 target과 가까운 거리 구하기.
		// 단, 좌측과 비교해서 작은 숫자만.
		len = 0;
		for(int i = data.length()-1; i >= 0 ; i--) {
			if(data.charAt(i) == target) {
				len = 0;
			} else {
				len ++;
				answer[i] = Math.min(answer[i], len);
			}
		}
		
		return answer;
	}
}
