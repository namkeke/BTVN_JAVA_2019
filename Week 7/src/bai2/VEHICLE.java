package bai2;

/**
 *
 * @author Tao
 */
public class VEHICLE {

    private String brand;
    private String NgaySX;
    private String Hang;

    public VEHICLE() {
    }

    public VEHICLE(String brand, String NgaySX, String Hang) {
        this.brand = brand;
        this.NgaySX = NgaySX;
        this.Hang = Hang;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(String NgaySX) {
        this.NgaySX = NgaySX;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }
    public void showInfo(){
        String info="\n=========================\nnNhãn hiệu: "+getBrand()+"\nNgày sản xuất: "+getNgaySX()+"\nHãng: "+getHang();
        System.out.println(info);
    }
}
