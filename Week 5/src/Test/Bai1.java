package Test;

import java.util.Scanner;

/**
 * @author PNam
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = "";
        int count = 0, p = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ss += s.charAt(i);
                p *= Integer.parseInt(ss);
                count++;
                ss = "";
            }
        }
        System.out.println("Số các ký tự là số: " + count + " Tich: " + p);

    }

}
