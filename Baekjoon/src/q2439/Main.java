package q2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j > i; j--) {
				System.out.printf("%s", ' ');
			}

			for (int j = 0; j <= i; j++) {
				System.out.printf("%c", '*');
			}
			System.out.println();
		}
	}
}
