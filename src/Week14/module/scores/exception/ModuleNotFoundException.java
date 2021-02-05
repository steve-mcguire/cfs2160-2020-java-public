package Week14.module.scores.exception;

public class ModuleNotFoundException extends Exception{
    public ModuleNotFoundException() {}

    public ModuleNotFoundException(String message){
        super (message);
    }
}
