package bai3_4;

import java.util.Scanner;

public class JavaClass {

    public static Scanner sc = new Scanner(System.in);

    private Student stdList[];
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
    
    public void Inputstudent() {
        System.out.println("Nhập số học sinh n= ");
        int n=sc.nextInt();
        Student []sv;
        sv = new Student[n];
        for (int i = 0; i < n; i++) {
            sv[i].InputInfo(sc.nextLine(),sc.nextLine(),sc.nextInt());
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
