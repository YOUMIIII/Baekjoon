package q2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String num2 = sc.next();
        sc.close();

        int[] numarr = new int[3];
        for(int i = numarr.length-1; i>=0; i--){
            numarr[i] = (int)(num2.charAt(i) - '0');
            System.out.println(numarr[i] * num1);
        }
        System.out.println(num1 * Integer.parseInt(num2));
    }
}
