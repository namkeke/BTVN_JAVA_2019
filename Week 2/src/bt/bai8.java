package bt;

import java.util.Scanner;

public class bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a= ");
        double a = sc.nextDouble();
        System.out.print("Nhap so b= ");
        double b = sc.nextDouble();
        System.out.print("Nhap so c= ");
        double c = sc.nextDouble();
        System.out.println("MAX(a,b,c) = " + (Math.max(a, Math.max(b, c))));
        System.out.println("MIN(a,b,c) = " + (Math.min(a, Math.min(b, c))));
    }
}
