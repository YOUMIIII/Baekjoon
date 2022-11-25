package q2441;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {
			// 공백 반복
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			// 별 반복
			for (int j = N; j > i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
