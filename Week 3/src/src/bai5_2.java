//Hiển thị kết quả a+b
//a<=100000000000000000000000000000000000000000
//b<=100000000000000000000000000000000000000000
package src;

import java.math.BigInteger;
import java.util.Scanner;

public class bai5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        String a = sc.nextLine();
        System.out.print("Nhap so b: ");
        String b = sc.nextLine();
        BigInteger aa = new BigInteger(a,10);
        BigInteger bb = new BigInteger(b,10);
        System.out.println(aa.add(bb));
    }
}
