package week16;

import week16.exceptions.ContactExistsException;
import week16.exceptions.NameNotFoundException;

public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        //add the contacts to the phone book
        try{
            pb.addContact("DB_CONN_STRING", "http://676.87.45,steve,password");
            pb.addContact("Ilias", "01484 644655");
            pb.addContact("Gary", "01484 567456");
            pb.addContact("Tony", "01132 876345");
        }catch(ContactExistsException c){
            System.out.println(c.getMessage());
        }



        //get contacts from the phone book
        try{
           String result = pb.lookUp("Dave");
            System.out.println(result);
        }catch(NameNotFoundException n){
            System.out.println(n.getMessage());
        }

    }

}
