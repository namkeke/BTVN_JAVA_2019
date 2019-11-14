package src;

import java.util.Scanner;

public class bai9 {

    public static void main(String[] args) {
        System.out.println("Giai PT bac 1: ax + b = 0");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a= ");
        double a = sc.nextDouble();
        System.out.print("Nhap so b= ");
        double b = sc.nextDouble();
        if (a != 0) {
            System.out.println("PT co nghiem duy nhat\nx= " + (-b / a));
        } else {
            if (b == 0) {
                System.out.println("PT vo so nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
        }
    }
}
