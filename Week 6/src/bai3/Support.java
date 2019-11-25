package bai3;

/**
 * @author Tao
 */
public class Support {

    private String name;
    private int age;
    private String[] ListNameOfMbers;

    public Support(String name, int age, String[] ListNameOfMbers) {
        this.name = name;
        this.age = age;
        this.ListNameOfMbers = ListNameOfMbers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getListNameOfMbers() {
        return ListNameOfMbers;
    }

    public void setListNameOfMbers(String[] ListNameOfMbers) {
        this.ListNameOfMbers = ListNameOfMbers;
    }

    public void ShowSp() {
        System.out.println("Name: " + getName()
                + " age: " + getAge());
        System.out.println("Name of" + getName() + "'s member:");
        for (String i : getListNameOfMbers()) {
            System.out.println("Name of member" + i);
        }
    }
}
