//Tạo dựng mô hình OOP theo đề bài sau:
//Tạo một Club gồm n Member
//Mỗi thành viên đều có mã sinh viên,tên, tuổi, lớp
//Hãy nhập và xuất các thành viên trong club có tên là HIT.
package HomeWork.Bai1;

/**
 *
 * @author PNam
 */
public class RunMain {

    public static void main(String[] args) {
        ClubHIT CL = new ClubHIT();
        CL.InputMember();
        CL.Show();
    }
}
