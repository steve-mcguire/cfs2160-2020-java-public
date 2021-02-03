package week16.exceptions;

public class ContactExistsException extends Exception{
    public ContactExistsException() {}

    public ContactExistsException(String message) {
        super(message);
    }
}
