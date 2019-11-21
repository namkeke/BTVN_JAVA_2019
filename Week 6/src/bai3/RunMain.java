//Member được định nghĩa như sau:
//thuộc tính: tên, ngày hoạt động, số ngày nghỉ trong lớp.
//phương thức: Hiển thị thông tin
//=> Dùng constructor tạo một CauLacBo và hiển thị thông tin
package bai3;

import java.util.Scanner;

/**
 *
 * @author Tao
 */
public class RunMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tvien:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten cac tvien cua suppor:");
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.nextLine();
        }
        Leader A = new Leader("A", 1, 1);
        Support B = new Support("B", 2, name);
        Member C = new Member("C", 3, 3);
        Club a = new Club(A, B, C);
        a.ShowClub();
    }
}
