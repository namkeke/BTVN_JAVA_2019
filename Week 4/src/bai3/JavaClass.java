package bai3;

import java.util.Scanner;

public class JavaClass {

    private Student[] stdList;
    public String leader;
    private int ratingStar;

    public void InputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sv n= ");
        int n = sc.nextInt();
        stdList = new Student[n];
        for(int i = 0; i < n; i++){
            stdList[i] = new Student();//????????????????agdahba
            stdList[i].InputInfo();
        }
    }

    public void ShowStudent() {
        for (Student stdList1 : stdList) {
            stdList1.ShowInfo();
        }
    }

    public void InputClassInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên leader: ");
        leader = sc.nextLine();
        System.out.print("Vote: ");
        ratingStar = sc.nextInt();
        InputStudent();
    }

    public void ShowClassInfo() {
        System.out.println("Leader: " + leader);
        System.out.println("RatingStart: " + ratingStar);
        ShowStudent();
    }
}
