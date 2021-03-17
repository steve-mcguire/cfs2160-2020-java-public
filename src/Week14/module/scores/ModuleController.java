package Week14.module.scores;

import Week14.module.scores.exception.ModuleNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ModuleController {
    private ArrayList<Module> modules = new ArrayList<>();

    public ModuleController() {}

    public void addModule(Module module){
        this.modules.add(module);
    }

    public void sortModules(){
        Collections.sort(modules);
    }

    /**
     *
     * @param searchTerm
     * @return
     * @throws ModuleNotFoundException
     */
    public Module searchModules (String searchTerm) throws ModuleNotFoundException {

        for (Module m : modules) {
            if (m.getName().contains(searchTerm) || m.getCode().contains(searchTerm)) {
                return m;
            }
        }
        //there is not return here
        //some way of sending error message
        throw new ModuleNotFoundException("No modules found for your search term: " + searchTerm, searchTerm);
    }

    /**
     * Some test text
     * @return a String with the contents of the ArrayList formatted
     * @throws ModuleNotFoundException
     */
    public String printModules () throws ModuleNotFoundException{
        StringBuilder sb = new StringBuilder();
        if (modules.isEmpty ()) {
            throw new ModuleNotFoundException("No modules found", null);
        }
        else {
            for (Module m : modules) {
                sb.append(m);
                sb.append("\n");
            }
        }
        return sb.toString();
    }


    public void purgeModule(){
        Iterator<Module> it = modules.iterator();
        while(it.hasNext()){
            //do the thing of interest
            Module module = it.next();
            if(!module.isActive()){
                it.remove();
            }
        }
    }

    public ArrayList<Module> getPassedModules(int passMark) throws Exception{
        ArrayList<Module> passedModules = new ArrayList<>();
        if(passMark > 0 && passMark <= 100 ){
            for(Module m : modules){
                if(m.getScore() >= passMark){
                    passedModules.add(m);
                }
            }
            if(passedModules.size() > 0){
                return passedModules;
            }
        }else{
            throw new Exception("Please enter a passmark between 0 and 100");
        }
        throw new Exception("No module scores are greater than the pass mark");
    }
}
