//Tạo dựng mô hình OOP theo đề bài sau:
//Một Knight (hiệp sĩ) có name, HP, MP;
//Knight có thể sử dụng kĩ năng Heal +30HP && -50MP,
//Ko thể sử dụng kĩ năng khi ko đủ năng lượng
//Cho anh ta sử dụng kĩ năng và hiển thị ra thông số sau mỗi lần sử dụng.
package HomeWork.Bai2;

import java.util.Scanner;

/**
 *
 * @author PNam
 */
public class RunMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Knight nv = new Knight();
        System.out.println("Let's input");
        nv.Input();
        do {
            nv.Show();
            System.out.println("\nLet's choose\n1.HEAL");
            System.out.println("!1.EXIT");
            int op = sc.nextByte();
            switch (op) {
                case 1:
                    if (nv.MP < 50 || nv.HP <= 0) {
                        System.out.println("\nNot enought MP");
                    } else {
                        nv.Heal();
                    }
                    break;
                default:
                    System.out.println("\nGood bye");
                    return;
            }
        } while (true);
    }
}
