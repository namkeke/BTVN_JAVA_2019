//Tạo 5 constructor của class ConHeo với:
//thuộc tính: tên, cân nặng, tuổi
//phương thức: Hiển thị thông tin
//=> Tạo và hiển thị 5 đối tượng tạo bằng 5 constructor khác nhau
package bai1;
/**
 *
 * @author Tao
 */
public class RunMain {
    public static void main(String[] args) {
        ConHeo h = new ConHeo("a", 1, 1);
        ConHeo h1 = new ConHeo("a1", 11, 11);
        ConHeo h2 = new ConHeo("a2", 12, 12);
        ConHeo h3 = new ConHeo("a3", 13, 13);
        ConHeo h4 = new ConHeo("a4", 14, 14);
        h.Show();
        h1.Show();
        h2.Show();
        h3.Show();
        h4.Show();
    }
}
