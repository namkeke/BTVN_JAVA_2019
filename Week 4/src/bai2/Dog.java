package bai2;

public class Dog {

    private String name = "";
    private int MP = 100;

    public void InputName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public int ShowMP(int mp) {
        return MP = mp;
    }

    public void ShowMP() {
        System.out.println("MP= " + MP);
    }

    public void Bark() {
        if (name.compareTo("") == 0) {
            System.out.println("Xin lỗi bạn chưa điền tên");
        } else {
            System.out.println(name + " sủa");
            MP -= 20;
        }
    }

}
