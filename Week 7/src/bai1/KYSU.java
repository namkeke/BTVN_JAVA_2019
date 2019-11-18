package bai1;

import java.util.Scanner;

/**
 *
 * @author Tao
 */
public class KYSU extends Person {

    private String majors;
    private int graduating;

    public KYSU(String name, String DateOfBirth, String PlaceOfBirth, String majors, int graduating) {
        super(name,DateOfBirth,PlaceOfBirth);
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

    public void Input() {
        Scanner sc = new Scanner(System.in);

    }
}
