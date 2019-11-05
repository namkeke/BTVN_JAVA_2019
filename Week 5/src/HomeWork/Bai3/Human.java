package HomeWork.Bai3;

import java.util.Scanner;

/**
 *
 * @author PNam
 */
public class Human {

    public String name;
    public int HP;
    public int dmg;

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("HP: ");
        HP = sc.nextInt();
        System.out.print("DMG: ");
        dmg = sc.nextInt();
    }
}
