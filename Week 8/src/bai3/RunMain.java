package bai3;

import java.util.ArrayList;

public class RunMain {
    public static void T18(Hacker a) {
        if (2019 - Integer.parseInt(a.getNamSinh()) == 18)
            a.HienThiThongTin();
    }

    public static void TenT(Hacker a) {
        String s = a.getTen().trim();
        if (s.indexOf("t") == 0)
            a.HienThiThongTin();
    }

    public static void main(String[] args) {
        Hacker Hacker1 = new Hacker();
        Hacker1.setTen("Hacker1");
        Hacker1.setNamSinh("1111");
        Hacker1.setDiaChi("Nhà");
        Hacker1.setSoThich("Ở Nhà");
        System.out.println("Hacker{" +
                "ten='" + Hacker1.getTen() + '\'' +
                ", namSinh='" + Hacker1.getNamSinh() + '\'' +
                ", diaChi='" + Hacker1.getDiaChi() + '\'' +
                ", soThich='" + Hacker1.getSoThich() + '\'' +
                '}');
        Hacker Hacker2 = new Hacker("ttttt", "2001", "Nhà hàng xóm");
        Hacker2.HienThiThongTin();

        ArrayList<Hacker> List = new ArrayList<Hacker>();
        List.add(Hacker1);
        List.add(Hacker2);
        for (int i = 0; i < List.size(); i++) {
            T18(List.get(i));
            TenT(List.get(i));
        }
    }
}
