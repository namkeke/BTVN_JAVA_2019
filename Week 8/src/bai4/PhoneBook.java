package bai4;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<CustomerPhone> PhoneBook;

    public PhoneBook() {
    }

    public PhoneBook(ArrayList<CustomerPhone> phoneBook) {
        PhoneBook = phoneBook;
    }

    public void AddCustomerPhone(CustomerPhone A) {
        PhoneBook.add(A);
    }


    public void ShowCustomerPhoneBookByName() {
        public CustomerPhone SearchByName (String name){
            if (PhoneBook.get(i).getName().trim().equals(name.trim()) == true)
                return PhoneBook.get(i);
        }
    }

//    public void ShowCustomerByName(String name) {
//        for (int i=0;i<PhoneBook.size())
//        CustomerPhone A = SearchCustomerPhoneByName(name);
//        A.ShowInfo();
//    }kiểm tra rồi show


}
