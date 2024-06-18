package twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// 두 배열 합치기
// 설명 : 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
// 입력 : 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
// 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
// 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
// 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
// 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
// 출력 : 오름차순으로 정렬된 배열을 출력합니다.
public class twoPointer_slidingWindow1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		ArrayList<Integer> data1 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			data1.add(scan.nextInt());
		}

		int m = scan.nextInt();
		ArrayList<Integer> data2 = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			data2.add(scan.nextInt());
		}

		twoPointer_slidingWindow1 pointers1 = new twoPointer_slidingWindow1();
		ArrayList<Integer> result = pointers1.solution(data1, data2);
		result.forEach(data -> {
			System.out.print(data + " ");
		});
	}

	public ArrayList<Integer> solution(ArrayList<Integer> data1, ArrayList<Integer> data2) {
		data1.addAll(data2);
		data1.sort(Comparator.naturalOrder());

		return data1;
	}
}
