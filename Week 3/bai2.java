//Nhập vào một chuỗi bất kì, hiển thị ra tổng các số trong chuỗi.

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ss = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ss += Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println(ss);
    }
}
