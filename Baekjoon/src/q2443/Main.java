/*
https://www.acmicpc.net/problem/2443
*/

package q2443;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for (int i = 1; i <= N; i++) {
			int a = N - i;
			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = a * 2 + 1; j > 0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
