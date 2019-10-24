package bai3;

import java.util.Scanner;

public class Student {

    private String name, code;
    private int age;

    public Student(String name, String code, int age) {
        this.name = name;
        this.code = code;
        this.age = age;
    }

    public void InputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student's name: ");
        name = sc.nextLine();
        System.out.println("Student's code: ");
        code = sc.nextLine();
        System.out.println("Student's age: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    public void ShowInfo() {//&&&&&&&&&&&&&&&&
        System.out.println("Name: " + name + " ,code: " + code + " ,age: " + age);
    }

}
