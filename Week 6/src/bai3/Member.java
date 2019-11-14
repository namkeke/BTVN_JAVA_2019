package bai3;

/**
 *
 * @author PNam
 */
public class Member {

    private String name;
    private int dayAtive;
    private int dayOff;

    public Member() {
    }

    public Member(String name, int dayAtive, int dayOff) {
        this.name = name;
        this.dayAtive = dayAtive;
        this.dayOff = dayOff;
    }

    public String getName() {
        return name;
    }

    public int getDayAtive() {
        return dayAtive;
    }

    public int getDayOff() {
        return dayOff;
    }

    public void ShowMember() {
        System.out.println("Name: " + getName() + "\nDay active: " + getDayAtive() + "\nDay off: " + getDayOff());
    }
}
