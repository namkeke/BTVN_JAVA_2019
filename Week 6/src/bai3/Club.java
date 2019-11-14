//Tạo class CauLacBo gồm:
//thuộc tính:
//private Leader A;
//private Support B;
//private Member C:
//phương thức: Hiển thị thông tin
//Leader được định nghĩa như sau:
//thuộc tính: tên, tuổi, số ngày lãnh đạo.
//phương thức: Hiển thị thông tin
//Support được định nghĩa như sau:
//thuộc tính: tên, tuổi, tên các thành viên trong nhóm.
//phương thức: Hiển thị thông tin
package bai3;

/**
 *
 * @author Tao
 */
public class Club {

    private Leader A;
    private Support B;
    private Member C;

    public Club() {
    }

    public Club(Leader A, Support B, Member C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void ShowClub() {
        A.showLeader();
        B.ShowSp();
        C.ShowMember();
    }
}
