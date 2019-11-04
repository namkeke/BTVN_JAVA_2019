/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.bai3;

import java.util.Scanner;

/**
 *
 * @author PNam
 */
public class DateTime {

    public int Ngay;
    public int Thang;
    public int Nam;

    public void InputDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        Ngay = sc.nextInt();
        System.out.println("Nhap thang: ");
        Thang = sc.nextInt();
        System.out.println("Nhap Nam: ");
        Nam = sc.nextInt();
    }

    public void OutputDate() {
        System.out.println(Ngay + "/" + Thang + "/" + Nam);
    }
}
