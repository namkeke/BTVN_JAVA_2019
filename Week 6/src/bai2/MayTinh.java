package bai2;

/**
 *
 * @author Tao
 */
public class MayTinh {

    public float TinhTong(float a, float b) {
        return a + b;
    }

    public float TinhTong(float a, float b, float c) {
        return a + b + c;
    }

    public float TinhTong(float a[]) {
        float s = 0;
        for (float i : a) {
            s += i;
        }
        return s;
    }
}
