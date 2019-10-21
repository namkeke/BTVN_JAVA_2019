package bai3_4;

import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);
    private String name;
    private String code;
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

    public void InputInfo(String name, String code, int age) {
        this.name = name;
        this.code = code;
        this.age = age;
    }

    public void ShowInfo() {
        System.out.println("Name: " + getName() + " ,code: " + getCode() + " ,age: " + getAge());
    }

}
