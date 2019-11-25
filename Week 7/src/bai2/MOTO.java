package bai2;

/**
 * @author Tao
 */
public class MOTO extends VEHICLE {

    private int phanKhoi;

    public MOTO() {
    }

    public MOTO(int phanKhoi, String brand, String NgaySX, String Hang) {
        super(brand, NgaySX, Hang);
        this.phanKhoi = phanKhoi;
    }

    public int getPhanKhoi() {
        return phanKhoi;
    }

    public void setPhanKhoi(int phanKhoi) {
        this.phanKhoi = phanKhoi;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Phân khối: " + getPhanKhoi());
    }
}
