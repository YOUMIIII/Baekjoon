package q1149;

import java.util.*;

class Color {
    int R;
    int G;
    int B;
}

public class Main {
    static Color mat[], v[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        mat = new Color[N];
        for (int i = 0; i < N; i++) {
            mat[i] = new Color();
        }
        v = new Color[N];
        for (int i = 0; i < N; i++) {
            v[i] = new Color();
        }

        for (int i = 0; i < N; i++) {
            mat[i].R = sc.nextInt();
            mat[i].G = sc.nextInt();
            mat[i].B = sc.nextInt();
        }
        sc.close();

        v[0].R = mat[0].R;
        v[0].G = mat[0].G;
        v[0].B = mat[0].B;
//        System.out.print(v[0].R + " ");
//        System.out.print(v[0].G + " ");
//        System.out.println(v[0].B);
        for (int i = 1; i < N; i++) {
            v[i].R = mat[i].R + (v[i - 1].G > v[i - 1].B ? v[i - 1].B : v[i - 1].G);
            v[i].G = mat[i].G + (v[i - 1].R > v[i - 1].B ? v[i - 1].B : v[i - 1].R);
            v[i].B = mat[i].B + (v[i - 1].G > v[i - 1].R ? v[i - 1].R : v[i - 1].G);
//            System.out.print(v[i].R + " ");
//            System.out.print(v[i].G + " ");
//            System.out.println(v[i].B);
        }
        int min = (v[N - 1].R > v[N - 1].G ? v[N - 1].G : v[N - 1].R);
        min = min > v[N - 1].B ? v[N - 1].B : min;

        System.out.println(min);
    }
}