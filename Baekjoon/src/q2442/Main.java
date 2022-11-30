package q2442;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 1; i <= N; i++) {
			for (int j = N - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int z = 0; z < i * 2 - 1; z++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}