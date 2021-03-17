package Week14.module.scores.exception;

public class ModuleNotFoundException extends Exception{
    public ModuleNotFoundException() {}

    public ModuleNotFoundException(String message, String searchTerm){
        super (message);
        //do something with the search term
        //System.out.println(searchTerm + " ERROR LOG");

    }
}
