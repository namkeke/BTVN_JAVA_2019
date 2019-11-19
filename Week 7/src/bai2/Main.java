package bai2;

/**
 *
 * @author Tao
 */
public class Main {

    public static void main(String[] args) {
        OTO o = new OTO(Byte.parseByte("4"), 1000, "Nam", "Today", "Nam");
        MOTO m = new MOTO(110, "Nam's neighbor", "Tomorrow", "Neighbor");
        o.showInfo();
        m.showInfo();
    }
}
