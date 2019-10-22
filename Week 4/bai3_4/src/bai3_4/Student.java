package bai3_4;

import java.util.Scanner;

public class Student {

    private String name, code;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String code, int age) {
        this.name = name;
        this.code = code;
        this.age = age;
    }

    public void InputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student's name: ");
        setName(sc.nextLine());
        System.out.println("Student's code: ");
        setCode(sc.nextLine());
        System.out.println("Student's age: ");
        setAge(sc.nextInt());
    }

    public void ShowInfo() {//&&&&&&&&&&&&&&&&
        System.out.println("Name: " + name + " ,code: " + code + " ,age: " + age);
    }

}
