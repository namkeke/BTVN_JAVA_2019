package src;

import java.util.Scanner;
//Nhập n số nguyên
//Tìm phần tử lớn thứ 3 (lớn gần nhất, chỉ nhỏ hơn 2 số) trong mảng.

public class bai1 {

    public static void MAX3(float[] a, int n) {
        float m1 = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > m1) {
                m1 = a[i];
            }
        }

        int L = 0;
        while (a[L] == m1 && L < n - 1) {
            L++;
        }

        if (L == n - 1 && a[n - 1] == m1) {
            System.out.println("Khong ton tai Max 2 nen ko ton tai Max 3");
        } else //Bat dau tim Max 2
        {
            float M2 = a[L];
            for (int i = 0; i < n; i++) {
                if (a[i] > M2 && a[i] != m1) {
                    M2 = a[i];
                }
            }
            int LL = 0;
            while ((a[LL] == M2 || a[LL] == m1) && LL < n - 2) {
                LL++;
            }
            if (LL == n - 2 && (a[n - 2] == M2 || a[n - 2] == m1)) {
                System.out.println("Khong ton tai Max 3");
            } else {
                float M3 = a[LL];
                for (int i = 0; i < n; i++) {
                    if (a[i] > M3 && a[i] != M2 && a[i] != m1) {
                        M3 = a[i];
                    }
                }
                System.out.println("Max 3: " + M3);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của arr: ");
        int n = sc.nextInt();
        float[] a = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            a[i] = sc.nextFloat();
        }
        MAX3(a, n);
    }

}
