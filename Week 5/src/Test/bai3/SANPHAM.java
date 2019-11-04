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
public class SANPHAM {

    public String MaSP;
    public String TenSP;
    public int SoLuong;
    public int DonGia;

    public void InputSP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap MaSP: ");
        MaSP = sc.nextLine();
        System.out.println("Nhap TenSp: ");
        TenSP = sc.nextLine();
        System.out.println("Nhap SoLuong: ");
        SoLuong = sc.nextInt();
        System.out.println("Nhap DonGia");
        DonGia = sc.nextInt();
    }

    public void OutputSP() {
        System.out.print("MaSP: " + MaSP + " TenSP: " + TenSP + " SoLuong: " + SoLuong + " DonGia: " + DonGia + "\n");
    }
}
