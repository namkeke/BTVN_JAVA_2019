package Test.bai3;

import Test.bai3.DateTime;
import java.util.Scanner;

/**
 *
 * @author PNam
 */
public class PHIEU {

    public String MaPhieu;
    public String TenPhieu;
    public DateTime a;
    public SANPHAM x[];
    public int n;

    public void InputPhieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so SP: ");
        n = sc.nextInt();
        x = new SANPHAM[n];
        for (int i = 0; i < n; i++) {
            x[i] = new SANPHAM();
            x[i].InputSP();
        }
    }

    public void OutputPhieu() {
        for (int i = 0; i < n; i++) {
            x[i].OutputSP();
        }
    }
}
