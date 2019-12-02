public class bai1 {
    public static int TinhTong(int a, int b, int c) {
        return a + b + c;
    }

    public static int TinhTheoCongThuc(int a, int b, int c) {
        return ((a / b) - c) / 2;
    }

    public static int ChuyenThanhString(int a, int b, int c) {
        String s = Integer.toString(a) + Integer.toString(b) + Integer.toString(c);
        return Integer.parseInt(s);
    }

    public static void HienThiHam(int a, int b, int c) {
        System.out.println(TinhTong(a, b, c));
        System.out.println(TinhTheoCongThuc(a, b, c));
        System.out.println(ChuyenThanhString(a, b, c));
    }

    public static void main(String[] args) {
        HienThiHam(1,2,3);
    }
}
