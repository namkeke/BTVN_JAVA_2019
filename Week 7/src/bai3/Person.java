package bai3;

import java.util.Scanner;

/**
 * @author Tao
 */
public class Person {

    private String name;
    private String DateOfBirth;
    private String PlaceOfBirth;

    public Person() {
    }

    public Person(String name, String DateOfBirth, String PlaceOfBirth) {
        this.name = name;
        this.DateOfBirth = DateOfBirth;
        this.PlaceOfBirth = PlaceOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getPlaceOfBirth() {
        return PlaceOfBirth;
    }

    public void setPlaceOfBirth(String PlaceOfBirth) {
        this.PlaceOfBirth = PlaceOfBirth;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n======================\nInput name: ");
        setName(sc.nextLine());
        System.out.print("Input date of birth: ");
        setDateOfBirth(sc.nextLine());
        System.out.print("Input place of birth: ");
        setPlaceOfBirth(sc.nextLine());
    }

    public void showInfo() {
        String info = "\n=========================\nName: " + getName() + "\nDate of birth: " + getDateOfBirth() + "\nPlace of birth: " + getPlaceOfBirth();
        System.out.println(info);
    }
}
