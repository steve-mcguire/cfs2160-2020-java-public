package Week10.PhoneBook;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> phoneBook = new ArrayList<>();

    public PhoneBook() {}

    public void addContact(Contact c){
         phoneBook.add(c);
    }

    public void printPhoneBook(){
        for(Contact c : phoneBook){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        Contact steve = new Contact("Steve McGuire", "+44 484 675243");
        Contact ilias = new Contact("Ilias Tachmazadis", "+44 484 6763432");
        pb.addContact(steve);
        pb.addContact(ilias);
        pb.printPhoneBook();

    }
}
