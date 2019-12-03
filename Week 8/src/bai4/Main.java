package bai4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CustomerPhone A = new CustomerPhone("AAA", 1, "111");
        CustomerPhone B = new CustomerPhone("BBB", 2, "222");
        CustomerPhone C = new CustomerPhone("CCC", 3, "333");
        ArrayList<CustomerPhone> AA = new ArrayList<CustomerPhone>();
        AA.add(A);
        AA.add(B);
        AA.add(C);
        PhoneBook Pb = new PhoneBook(AA);
        Pb.ShowCustomerByName("BBB");
        Pb.ShowCustomerPhoneBookByAge(1, 20);
        Pb.ShowAllPhoneBook();
    }
}
