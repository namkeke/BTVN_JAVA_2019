package HomeWork.Bai4;

import HomeWork.Bai3.Human;

public class Attack {

    public static void main(String[] args) {
        Human p1 = new Human();
        Human p2 = new Human();
        System.out.println("Input info P1:");
        p1.Input();
        System.out.println("Input info P2:");
        p2.Input();
        do {
            System.out.println("/nStatus\nP1: " + p1.HP + "\nP2: " + p2.HP);
            if (p1.HP <= 0 || p2.HP <= 0) {
                if (p1.HP < p2.HP) {
                    System.out.println("/nP2 is a winner");
                    return;
                } else if (p1.HP == p2.HP) {
                    System.out.println("/nDraw");
                    return;
                } else {
                    System.out.println("/nP1 is a winner");
                    return;
                }
            }
            p1.HP -= p2.dmg;
            p2.HP -= p1.dmg;
        } while (true);
    }
}
