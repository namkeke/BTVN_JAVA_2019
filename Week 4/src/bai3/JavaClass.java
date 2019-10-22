package bai3;

import java.util.Scanner;

public class JavaClass {

    private Student[] stdList;
    public String leader;
    private int ratingStar;

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public int getRatingStar() {
        return ratingStar;
    }

    public void setRatingStar(int ratingStar) {
        this.ratingStar = ratingStar;
    }
//    static Student[] sv = null;
//    static int n = 0;

    public void InputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sv n= ");
        int n = sc.nextInt();
        stdList = new Student[n];
        for (int i = 0; i < n; i++) {
            stdList[i] = new Student();
            stdList[i].InputInfo();
        }
    }

    public void ShowStudent() {
        for (int i = 0; i < stdList.length; i++) {
            stdList[i].ShowInfo();
        }
    }

    public void InputClassInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên leader: ");
        leader = sc.nextLine();
        System.out.print("Vote: ");
        ratingStar = sc.nextInt();
        InputStudent();
    }

    public void ShowClassInfo() {
        System.out.println("Leader: " + getLeader());
        System.out.println("RatingStart: " + getRatingStar());
        ShowStudent();
    }
}
