package HomeWork.Bai2;

import java.util.Scanner;

/**
 * @author PNam
 */
public class Knight {

    public String name;
    public int HP;
    public int MP;

    public void Heal() {
        HP += 30;
        MP -= 50;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Character's name: ");
        name = sc.nextLine();
        System.out.print("HP: ");
        HP = sc.nextInt();
        System.out.print("MP: ");
        MP = sc.nextInt();
    }

    public void Show() {
        System.out.println("\nStatus:\nName: " + name + "\nHP: " + HP + "\nMP: " + MP);
    }
}
