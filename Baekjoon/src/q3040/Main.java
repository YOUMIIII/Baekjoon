/*
https://www.acmicpc.net/problem/3040
*/

package q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numarr = new int[9];
		for (int i = 0; i < numarr.length; i++) {
			numarr[i] = sc.nextInt();
		}
		sc.close();
		
		//1번째 방법
		int sum = 0;
		for (int i = 0; i < numarr.length; i++) {
			sum += numarr[i];
		}

		for (int i = 0; i < numarr.length; i++) {
			for (int j = 0; j < numarr.length; j++) {
				if (sum - numarr[i] - numarr[j] == 100) {
					numarr[i] = 0;
					numarr[j] = 0;
					i = 10;
					break;
				}
			}
		}

		for (int i = 0; i < numarr.length; i++) {
			if (numarr[i] != 0)
				System.out.println(numarr[i]);
		}

		//2번째 방법
//		int result = sum - 100;
//		int fake1 = 0, fake2 = 0;
//
//		for (int i = 0; i < numarr.length; i++) {
//			for (int j = 0; j < numarr.length; j++) {
//				if (i != j) {
//					if (numarr[i] + numarr[j] == result) {
//						fake1 = i;
//						fake2 = j;
//						break;
//					}
//				}
//			}
//		}

//		for (int i = 0; i < numarr.length; i++) {
//			if (i != fake1 && i != fake2)
//				System.out.println(numarr[i]);
//		}
	}
}
