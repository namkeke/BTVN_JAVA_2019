package src;

import java.util.Scanner;
//Hiển thị kết quả a+b
//a<=100000000000000000000000000000000000000000
//b<=100000000000000000000000000000000000000000

public class bai5_1 {

//    baì này em làm đang ko biết sai ở đâu
//    và e ko biết debug trên cái ide này ntn anh check giúp  em với
//    bài này em làm theo mảng char cộng các phần tử và nhớ sang cột bên cạnh
//    em có làm bai5_2 là cách khác
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
        int kkk = a.length();
//        System.out.println(a);
//        System.out.println(b);
//        char[] aa = a.toCharArray();
//        char[] bb = b.toCharArray();
        int t, n = 0;
        String s = "";
        for (int i = kkk; i >= 0; i--) {
            t = n + Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i));
            // lấy giá trị từ char + với nhau được t
            String ss = Integer.toString(t% 10);
            //chuyển last digit của t+ nhớ ra string 
            if (t > 9) {
                n = 1;
            } else {
                n = 0;
            }
            s = ss + s;// cộng ra đằng trước của s cũ
        }
        System.out.println(s);
    }
}
