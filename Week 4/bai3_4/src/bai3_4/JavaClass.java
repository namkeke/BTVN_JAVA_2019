package bai3_4;

import java.util.Scanner;

public class JavaClass {

    public Scanner sc = new Scanner(System.in);

    private Student arrList[];
    public String leader;
    private int ratingStart;

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public int getRatingStart() {
        return ratingStart;
    }

    public void setRatingStart(int ratingStart) {
        this.ratingStart = ratingStart;
    }
    static Student[] sv = null;
    static int n = 0;

    public void Inputstudent() {
        System.out.println("Nhập số học sinh n= ");
        n = sc.nextInt();
        sv = new Student[n];
        for (int i = 0; i < n; i++) {
            sv[i].InputInfo();
        }
    }

    public void ShowStudent() {
        for (int i = 0; i < n; i++) {
            sv[i].ShowInfo();
        }
    }

    public void InputClassInfo() {
        System.out.println("tên leader: ");
        setLeader(sc.nextLine());
        System.out.println("Nhap rating: ");
        setRatingStart(sc.nextInt());
        Inputstudent();
    }

    public void ShowClassInfo() {
        System.out.println("tên leader: " + getLeader());
        System.out.println("RatingStart: " + getRatingStart());
        ShowStudent();
    }
}
