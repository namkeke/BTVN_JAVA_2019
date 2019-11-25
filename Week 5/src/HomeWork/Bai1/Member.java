package HomeWork.Bai1;

import java.util.Scanner;

/**
 * @author PNam
 */
public class Member {

    public String code;
    public String name;
    public int age;
    public String clas;

    public void InputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMem's code: ");
        code = sc.nextLine();
        System.out.print("Mem's name: ");
        name = sc.nextLine();
        System.out.print("Mem's age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Mem's class: ");
        clas = sc.nextLine();
    }

    public void ShowInfo() {
        System.out.println("code: " + code + " ,name: " + name + " ,age: " + age + " ,class: " + clas);
    }
}
