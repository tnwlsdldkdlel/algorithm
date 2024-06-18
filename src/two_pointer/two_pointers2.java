package two_pointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 공통원소 구하기
// 설명 : A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
// 입력 : 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
// 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
// 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
// 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
// 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
// 출력 : 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
public class two_pointers2 {

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

		two_pointers2 pointers2 = new two_pointers2();
		ArrayList<Integer> result = pointers2.solution(data1, data2);
		result.forEach(data -> {
			System.out.print(data + " ");
		});
	}

	public ArrayList<Integer> solution(ArrayList<Integer> data1, ArrayList<Integer> data2) {
		ArrayList<Integer> result = new ArrayList<>();

		// 투포인터 알고리즘을 하기 위해서는 먼저 정렬이 되어있어야함.
		Collections.sort(data1);
		Collections.sort(data2);

		int index1 = 0;
		int index2 = 0;
		while (index1 < data1.size() && index2 < data2.size()) {
			int a = data1.get(index1);
			int b = data2.get(index2);

			// 중복된 데이터가 있는 경우 담고, 두 배열 모두 인덱스를 올려준다.
			if (a == b) {
				result.add(a);
				index1++;
				index2++;
				// 여기서 부터 값이 작은 쪽만 인덱스를 올려준다.
				// 어쩌피 정렬했기 때문에 만약 a가 3이고 b가 5인 경우 b에는 a값과 같은수는 없으므로 작은쪽을 올려주는 것이다.
			} else if (a < b) {
				index1++;
			} else {
				index2++;
			}
		}

		return result;
	}
}
