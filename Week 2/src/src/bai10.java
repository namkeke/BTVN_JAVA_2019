package src;

import java.util.Scanner;

public class bai10 {

    public static void main(String[] args) {
        System.out.println("Giai PT bac 1: ax^2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a= ");
        double a = sc.nextDouble();
        System.out.print("Nhap b= ");
        double b = sc.nextDouble();
        System.out.print("Nhap c= ");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b != 0) {
                System.out.println("PT co nghiem duy nhat\nx= " + (-c / b));
            } else {
                System.out.println((c == 0) ? "PT vo so nghiem" : "PT vo nghiem");
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("PT vo nghiem");
            } else if (d == 0) {
                System.out.println("PT co nghiem duy nhat\nx= " + (-b / 2 / a));
            } else {
                System.out.println("PT co 2 nghiem\nx1= " + ((-b + Math.sqrt(d)) / 2 / a) + "\nx2= " + ((-b - Math.sqrt(d)) / 2 / a));
            }
        }
    }
}
