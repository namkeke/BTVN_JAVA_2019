//Một chuỗi được gọi là thân thiện khi nó có hello trong chuỗi
//Bạn được phép bỏ đi 1 kí tự bao nhiêu lần cũng được
//cho đến khi nào tìm thấy hoặc không tìm thấy chữ hello.
//Hãy in ra Yes nếu thấy và No nếu ngược lại.
package src;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        System.out.println();
        String s = sc.nextLine();
        int k = s.length();
        char[] b = s.toCharArray();
        int j = 0;
        for (int i = 0; i < k; i++) {
            if (b[i] == a[j]) {
                j++;
            }
            if (j == 5) {
                System.out.println("YES");
                return;
            }
        }
        if (j != 5) {
            System.out.println("NO");
        }
    }

}
