package bt;

import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n1= ");
        int n1 = sc.nextInt();
        System.out.print("Nhap so nguyen m1= ");
        int m1 = sc.nextInt();
        System.out.print("Nhap so thuc n2= ");
        double n2 = sc.nextDouble();
        System.out.print("Nhap so thuc m2= ");
        double m2 = sc.nextDouble();
        System.out.println("n1 + m1 = " + (n1 + m1));
        System.out.println("n2 + m2 = " + (n2 + m2));
    }
}
