package bai3;

/**
 *
 * @author Tao
 */
public class Leader {

    private String name;
    private int age;
    private int leadingDays;

    public Leader() {
    }

    public Leader(String name, int age, int leadingDays) {
        this.name = name;
        this.age = age;
        this.leadingDays = leadingDays;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLeadingDays() {
        return leadingDays;
    }

    public void showLeader() {
        System.out.println("Name: " + getName() + " age: " + getAge() + "\nNumber of days leading: " + getLeadingDays());
    }
}
