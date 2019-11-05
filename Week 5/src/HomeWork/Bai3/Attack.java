//Tạo dựng mô hình OOP theo đề bài sau:
//Một BattleField gồm 2 Human để đánh nhau
//Mỗi Human có name,HP,dmg,Attack
//Trên sàn đấu tạo ra 2 người
//P1 đánh 4 lần P2,P2 sẽ đánh 5 lần vào P1,
//Mỗi lần đánh sẽ hiển thị thông số 2 người
//Người có máu cao hơn sẽ dành chiến thắng.In ra người đó.
package HomeWork.Bai3;

/**
 *
 * @author PNam
 */
public class Attack {

    public static void main(String[] args) {
        Human p1 = new Human();
        Human p2 = new Human();
        System.out.println("Input info P1:");
        p1.Input();
        System.out.println("Input info P2:");
        p2.Input();
        do {
            for (int i = 0; i < 4; i++) {
                p2.HP -= p1.dmg;
                if (p2.HP > 0) {
                    System.out.println("\nStatus \nP1.HP: " + p1.HP + "\nP2.HP: " + p2.HP);
                } else {
                    System.out.println("\nP1 is a winner\nP1.HP: " + p1.HP);
                    return;
                }
            }
            for (int i = 0; i < 5; i++) {
                p1.HP -= p2.dmg;
                if (p1.HP > 0) {
                    System.out.println("\nStatus \nP1.HP: " + p1.HP + "\nP2.HP: " + p2.HP);
                } else {
                    System.out.println("\nP2 is a winner\nP1.HP: " + p2.HP);
                    return;
                }
            }
        } while (true);
    }
}
