public class bai2 {
    public static int Tinh(int a) {
        if (a < 51&&a>0)
            return 4000 * a;
        if (a < 101)
            return 4000 * 50 + 3000 * (a - 50);
        if (a >= 101) {
            int s = 7000 * 50, b = 3000;
            for (int i = 100; i < a; i++) {
                b -= 10;
                s += b;
            }
            return s;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Tinh(45));
    }
}
