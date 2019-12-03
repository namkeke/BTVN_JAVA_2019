package bai4;

public class CustomerPhone {
    private String name;
    private int age;
    private String phone;

    public CustomerPhone() {
    }

    public CustomerPhone(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "CustomerPhone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void ShowInfor() {
        System.out.println(toString());
    }
}
