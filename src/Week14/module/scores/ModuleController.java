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

    public Module searchModules (String search) throws ModuleNotFoundException {
        for (Module m : modules) {
            if (m.getName().contains(search) || m.getCode().contains(search)) {
                return m;
            }
        }
        throw new ModuleNotFoundException("Module not found");
    }

    public String printModules () throws ModuleNotFoundException{
        StringBuilder sb = new StringBuilder();
        if (modules.isEmpty ()) {
            throw new ModuleNotFoundException("No modules found");
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
        Iterator<Module> mit = modules.iterator();
        while (mit.hasNext ()) {
            Module j = mit.next ();
            if (!j.isActive()) {
                mit.remove ();
            }
        }
    }
}
