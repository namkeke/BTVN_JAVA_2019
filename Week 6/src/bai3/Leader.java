package bai3;

/**
 *
 * @author Tao
 */
public class Leader {

    private String name;
    private byte age;
    private int leadingDays;

    public Leader() {
    }

    public Leader(String name, byte age, int leadingDays) {
        this.name = name;
        this.age = age;
        this.leadingDays = leadingDays;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public int getLeadingDays() {
        return leadingDays;
    }

    public void showLeader() {
        System.out.println("Name: " + getName() + " age: " + getAge() + "\nNumber of days leading: " + getLeadingDays());
    }
}
