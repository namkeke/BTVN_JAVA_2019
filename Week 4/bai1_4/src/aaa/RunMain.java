//Tạo class Person như bảng trên và thực hiện yêu cầu:
//Trong class Person
//Tạo getter, setter cho các thuộc tính.
//Tạo class RunMain có hàm main trong đó
//Tạo ra 2 đối tượng Person SonNghien và Person TuBueDe.
//Dùng Setter truyền vào giá trị thông tin cho 2 đối tượng (Không phải nhập).
//Hiển thị thông tin 2 đối tượng.
package aaa;

import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person SonNghien = new Person();
        Person TuBueDue = new Person();

        SonNghien.setName(sc.nextLine());
        SonNghien.setAge(sc.nextInt());
        sc.nextLine();
        SonNghien.setHobby(sc.nextLine());
        SonNghien.setSex(sc.nextLine());

        System.out.println(SonNghien.getName());
        System.out.println(SonNghien.getAge());
        System.out.println(SonNghien.getHobby());
        System.out.println(SonNghien.getSex());

        TuBueDue.setName(sc.nextLine());
        TuBueDue.setAge(sc.nextInt());
        sc.nextLine();
        TuBueDue.setHobby(sc.nextLine());
        TuBueDue.setSex(sc.nextLine());

        System.out.println(TuBueDue.getName());
        System.out.println(TuBueDue.getAge());
        System.out.println(TuBueDue.getHobby());
        System.out.println(TuBueDue.getSex());
    }

}
