package bai2;

/**
 * @author Tao
 */
public class OTO extends VEHICLE {

    private Byte soCho;
    private int Dungtich;

    public OTO() {
    }

    public OTO(Byte soCho, int Dungtich, String brand, String NgaySX, String Hang) {
        super(brand, NgaySX, Hang);
        this.soCho = soCho;
        this.Dungtich = Dungtich;
    }

    public Byte getSoCho() {
        return soCho;
    }

    public void setSoCho(Byte soCho) {
        this.soCho = soCho;
    }

    public int getDungtich() {
        return Dungtich;
    }

    public void setDungtich(int Dungtich) {
        this.Dungtich = Dungtich;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Số chỗ ngồi: " + getSoCho());
        System.out.println("Dung tich: " + getDungtich());
    }

}
