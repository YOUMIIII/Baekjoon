package q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String q = sc.next();
			int sum = 0;
			int cur = 1;
			for (int j = 0; j < q.length(); j++) {
				if (q.charAt(j) == 'O') {
					sum += cur;
					cur++;
				} else {
					cur = 1;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
