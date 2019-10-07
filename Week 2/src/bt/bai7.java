package bt;

import java.util.Scanner;

public class bai7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n= ");
        int n = sc.nextInt();
        System.out.print("Nhap so nguyen m= ");
        int m = sc.nextInt();
        System.out.println("MAX(m,n) = " + Math.max(m, n));
        System.out.println("MIN(m,n) = " + Math.min(m, n));
    }
}
