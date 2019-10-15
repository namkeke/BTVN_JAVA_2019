//Hiển thị Menu với nội dung như bên dưới:
//Tạo và nhập mảng mới với n số nguyên
//Hiển thị mảng vừa tạo
//Thêm một phần tử vào vị trí thứ k
//Xóa một phần tử ở vị trí thứ k
//Đảo ngược mảng:
//Hiển thị số a[1] và các số chia hết cho a[1]
//Thoát.
package bt;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng n= ");
        int n = sc.nextInt();
        int[] a = new int[n + 100];
        do {
            System.out.println("\n===============Menu============");
            System.out.println("1.Nhập mảng");
            System.out.println("2.Hiển thị mảng vừa tạo-");
            System.out.println("3.Thêm một phần tử vào vị trí thứ k");
            System.out.println("4.Xóa một phần tử ở vị trí thứ k");
            System.out.println("5.Đảo ngược mảng:");
            System.out.println("6.Hiển thị số a[1] và các số chia hết cho a[1]");
            System.out.println("7.Thoát");
            System.out.println("Nhập số bạn muốn chọn");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.print("a["+i+"] = ");
                        a[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Mảng: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    break;
                case 3:
                    n++;
                    System.out.print("Nhập vị trí k: ");
                    int k = sc.nextInt();
                    System.out.print("Nhập phần tử cần thêm: ");
                    int kk = sc.nextInt();
                    for (int i = k - 1; i < n; i++) {
                        int q = a[i];
                        a[i] = kk;
                        kk = q;
                    }
                    break;
                case 4:
                    System.out.print("Nhập vị trí k: ");
                    int k4 = sc.nextInt();
                    for (int i = k4 - 1; i <= n; i++) {
                        a[i] = a[i + 1];
                    }
                    n--;
                    break;
                case 5:
                    for (int i = 0; i < n / 2; i++) {
                        int temp = a[i];
                        a[i] = a[n - i - 1];
                        a[n - i - 1] = temp;
                    }
                    break;
                case 6:
                    for (int i = 0; i < n; i++) {
                        if (i % a[1] == 0) {
                            System.out.print(a[i] + " ");
                        }
                    }
                    break;
                default:
                    System.out.println("Bạn đã chọn 7 hoặc chọn sai");
                    System.out.println("END.");
                    return;
            }
        } while (1 == 1);
    }
}
