package bai3;

import java.util.Scanner;

/**
 *
 * @author Tao
 */
public class SinhVien extends Person {

    private String ID;
    private String major;
    private int khoaHoc;

    public SinhVien() {
    }

    public SinhVien(String ID, String major, int khoaHoc, String name, String DateOfBirth, String PlaceOfBirth) {
        super(name, DateOfBirth, PlaceOfBirth);
        this.ID = ID;
        this.major = major;
        this.khoaHoc = khoaHoc;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Id: ");
        setID(sc.nextLine());
        System.out.print("Input major: ");
        setMajor(sc.nextLine());
        System.out.print("Nhập khóa học: ");
        setKhoaHoc(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ID: " + getID());
        System.out.println("Chuyên ngành: " + getMajor());
        System.out.println("Khóa học: " + getKhoaHoc());
    }

}
