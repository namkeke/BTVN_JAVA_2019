package bai4;

import java.util.ArrayList;

public class PhoneBook extends CustomerPhone {
    private ArrayList<CustomerPhone> PhoneBook;

    public PhoneBook() {
    }

    public PhoneBook(ArrayList<CustomerPhone> phoneBook) {
        PhoneBook = phoneBook;
    }

    public void AddCustomerPhone(CustomerPhone A) {
        PhoneBook.add(A);
    }

    public CustomerPhone SearchByName(int i, String name) {
        if (PhoneBook.get(i).getName().trim().equals(name.trim()) == true)
            return PhoneBook.get(i);
        return new CustomerPhone(null, 0, null);
    }

    public void ShowCustomerByName(String name) {
        for (int i = 0; i < PhoneBook.size(); i++) {
            CustomerPhone A = SearchByName(i, name);
            if (A.getName() != null)
                A.ShowInfor();
        }
    }

    public CustomerPhone SearchByAge(int i, int age1, int age2) {
        if (age1 > age2) {
            int ii = age1;
            age1 = age2;
            age2 = ii;
        }
        int k2 = age2;
        if (age2 > PhoneBook.size()) {
            k = PhoneBook.size();
        }
        for (int ii = age1; ii <= k; ii++) {
            if (PhoneBook.get(i).getAge() == ii)
                return PhoneBook.get(i);
        }
        return new CustomerPhone(null, 0, null);
    }


    public void ShowCustomerPhoneBookByAge(int age1, int age2) {
        for (int i = 0; i < PhoneBook.size(); i++) {
            CustomerPhone A = SearchByAge(i, age1, age2);
            if (A.getName() != null)
                A.ShowInfor();
        }
    }

    public void ShowAllPhoneBook() {
        System.out.println(PhoneBook);
    }
}


