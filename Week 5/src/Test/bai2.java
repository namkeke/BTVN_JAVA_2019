/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;

/**
 * @author PNam
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    double q = a[i];
                    a[i] = a[j];
                    a[j] = q;
                }
            }
        }
        for (double b : a) {
            System.out.print(b + " ");
        }
        int count2 = 0;
        System.out.print("\nSo chinh phuong: ");
        for (int i = 0; i < n; i++) {
            int ii = (int) Math.sqrt(a[i]);
            if (Math.pow(ii, 2) == a[i]) {
                count2++;
                System.out.print("\n" + a[i] + " ");
            }
        }
        System.out.println("\nSo luong SCP: " + count2);

    }

}
