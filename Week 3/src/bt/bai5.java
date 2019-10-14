package bt;

import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        String a = sc.nextLine();
        System.out.print("Nhap so b: ");
        String b = sc.nextLine();
        int k, kk;
        if (a.length() > b.length()) {
            k = a.length();
            kk = a.length() - b.length();
            String bbb = "";
            for (int i = 0; i < kk; i++) {
                bbb += "0";
            }
            b = bbb + b;
        } else {
            k = b.length();
            kk = b.length() - a.length();
            String bbb = "";
            for (int i = 0; i < kk; i++) {
                bbb += "0";
            }
            a = bbb + a;
        }//chuẩn hóa
//        System.out.println(a);
//        System.out.println(b);
//        char[] aa = a.toCharArray();
//        char[] bb = b.toCharArray();
        int t,n=0;
        String s = "";
        for (int i = k; i >= 0; i--) {
            t = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i));
            String ss = Integer.toString(((t + n) % 10));
            if (t > 9) {
                n = 1;
            }
            s = ss + s;
        }
        System.out.println(s);
    }
}
