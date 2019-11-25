package bai1;

import bai3.Person;

import java.util.Scanner;

/**
 * @author Tao
 */
public class Kysu extends Person {

    private String majors;
    private int graduating;

    public Kysu() {
    }

    public Kysu(String majors, int graduating, String name, String DateOfBirth, String PlaceOfBirth) {
        super(name, DateOfBirth, PlaceOfBirth);
        this.majors = majors;
        this.graduating = graduating;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getGraduating() {
        return graduating;
    }

    public void setGraduating(int graduating) {
        this.graduating = graduating;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input major: ");
        setMajors(sc.nextLine());
        System.out.print("Input year: ");
        setGraduating(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Major: " + getMajors());
        System.out.println("Graduation year: " + getGraduating());
    }
}
