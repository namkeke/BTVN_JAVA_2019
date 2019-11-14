//Tạo class MayTinh với:
//phương thức: 
//TinhTong(float a,float b)
//TinhTong(float a,float b,float c)
//TinhTong(float a[])
//=>Tạo một MayTinh, tạo giá trị và sử dụng hàm tính tống
//Các hàm đều là kiểu trả về và hiển thị hàm TinhTong đó.
package bai2;

/**
 *
 * @author Tao
 */
public class RunMain {

    public static void main(String[] args) {
        MayTinh p = new MayTinh();
        System.out.println(p.TinhTong(1, 2));
        System.out.println(p.TinhTong(1, 2, 3));
        float[] a = new float[]{1, 2, 3, 4, 5};
        System.out.println(p.TinhTong(a));
    }
}
