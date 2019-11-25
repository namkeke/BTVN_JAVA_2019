package bai1;

/**
 * @author Tao
 */
public class ConHeo {

    private String name;
    private float weigh;
    private int age;

    public ConHeo() {
    }

    public ConHeo(String name, float weigh, int age) {
        this.name = name;
        this.weigh = weigh;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeigh() {
        return weigh;
    }

    public void setWeigh(float weigh) {
        this.weigh = weigh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Show() {
        System.out.println("Name: " + getName() + " weigh: " + getWeigh() + " age: " + getAge());
    }
}
