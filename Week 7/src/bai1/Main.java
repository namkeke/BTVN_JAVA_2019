//Đề: drive.google.com/open?id=1Zg7x2wkBoVax883Xkyc4vm9YM4zIVDzAgaWTgMjuaKA
package bai1;

import java.util.Scanner;

/**
 * @author Tao
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số kỹ sư: ");
        int n = sc.nextInt();
        Kysu[] list = new Kysu[n];
        for (int i = 0; i < n; i++) {
            list[i] = new Kysu();
            list[i].inputInfo();
        }
        int max = list[0].getGraduating();
        for (Kysu i : list) {
            i.showInfo();
            if (i.getGraduating() > max) {
                max = i.getGraduating();
            }
        }
        System.out.println("Ky sư tốt nghiệp gần đây:");
        for (Kysu i : list) {
            if (i.getGraduating() == max) {
                i.showInfo();
            }
        }
    }
}
