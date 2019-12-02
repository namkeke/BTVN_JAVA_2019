package bai3;

public class Hacker {
    private String ten, namSinh, diaChi, soThich;

    public Hacker() {
    }

    public Hacker(String ten, String namSinh, String diaChi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    @Override
    public String toString() {
        return "Hacker{" +
                "ten='" + ten + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soThich='" + soThich + '\'' +
                '}';
    }

    public void HienThiThongTin() {
        System.out.println(toString());
    }
}
