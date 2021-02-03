package week16;

import week16.exceptions.ContactExistsException;
import week16.exceptions.NameNotFoundException;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> phoneBook = new HashMap<>();

    public PhoneBook() {}

    public void addContact(String name, String number) throws ContactExistsException{
        if(phoneBook.containsKey(name)){
            throw new ContactExistsException("The name already exists in the phone book");
        }else{
            phoneBook.put(name, number);
        }
    }

    public String lookUp(String name) throws NameNotFoundException {
        if(!phoneBook.containsKey(name)){
            throw new NameNotFoundException("Name not found in the phone book");
        }
        return phoneBook.get(name);
    }
}
