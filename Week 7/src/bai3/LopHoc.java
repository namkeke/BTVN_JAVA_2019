package bai3;

import java.util.Scanner;

/**
 *
 * @author Tao
 */
public class LopHoc {

    private String MaLH;
    private String TenLH;
    private String NgayMo;
    private String GiaoVien;
    public SinhVien[] x;
    private int n;

    public LopHoc() {
    }

    public LopHoc(String MaLH, String TenLH, String NgayMo, int n, String GiaoVien, SinhVien[] x) {
        this.MaLH = MaLH;
        this.TenLH = TenLH;
        this.NgayMo = NgayMo;
        this.n = n;
        this.GiaoVien = GiaoVien;
        this.x = x;
    }

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public void setTenLH(String TenLH) {
        this.TenLH = TenLH;
    }

    public String getNgayMo() {
        return NgayMo;
    }

    public void setNgayMo(String NgayMo) {
        this.NgayMo = NgayMo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return GiaoVien;
    }

    public void setGiaoVien(String GiaoVien) {
        this.GiaoVien = GiaoVien;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp số sinh viên ");
        setN(Integer.parseInt(sc.nextLine()));
        x = new SinhVien[getN()];
        System.out.println("Nhập thông tin của các sinh viên\n");
        for (int i = 0; i < getN(); i++) {
            x[i]=new SinhVien();
            x[i].inputInfo();
        }
        System.out.println("Nhập mã lớp: ");
        setMaLH(sc.nextLine());
        System.out.println("Nhập tên lớp: ");
        setTenLH(sc.nextLine());
        System.out.println("Nhập ngày mở: ");
        setNgayMo(sc.nextLine());
        System.out.println("Nhập tên giáo viên: ");
        setGiaoVien(sc.nextLine());
    }

    public void Show() {
        System.out.println("Lớp có " + getN() + " sinh viên lần lượt là:\n");
        int count = 0;
        for (SinhVien i : x) {
            i.showInfo();
            if (i.getKhoaHoc() == 11) {
                count++;
            }
        }
        System.out.println("Có " + count + "sinh viên khóa 11");
        System.out.println("Danh sách sinh viên sau sắp xếp:\n");
        SinhVien t = new SinhVien();
        for (int i = 0; i < getN(); i++) {
            for (int j = i + 1; i < getN(); i++) {
                if (x[i].getKhoaHoc() > x[j].getKhoaHoc()) {
                    t = x[i];
                    x[i] = x[j];
                    x[j] = t;
                }
            }
        }
        for (SinhVien i : x) {
            i.showInfo();
        }
    }
}
