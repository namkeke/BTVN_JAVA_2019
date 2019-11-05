package HomeWork.Bai1;

import java.util.Scanner;

/**
 *
 * @author PNam
 */
public class ClubHIT {

    public Member[] List;

    public void InputMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thành viên: ");
        int n = sc.nextInt();
        List = new Member[n];
        for (int i = 0; i < n; i++) {
            List[i] = new Member();
            System.out.println("Input infomation member[" + (i + 1) + "]");
            List[i].InputInfo();
        }
    }

    public void Show() {
        int ii=0;
        for (Member i : List) {
            ii++;
            System.out.print("Member[" + ii + "]: ");
            i.ShowInfo();
        }
    }

}
