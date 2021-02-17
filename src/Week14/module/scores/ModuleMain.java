package Week14.module.scores;

import Week14.module.scores.exception.ModuleNotFoundException;

import java.util.ArrayList;

public class ModuleMain {
    public static void main(String[] args) throws ModuleNotFoundException {
        //create the controller
        ModuleController mc = new ModuleController();
        //create and add the Modules
        Module cfs2160 = new Module("CFS2160", "Software Design and Development", 46);
        mc.addModule(cfs2160);
        Module cfm2175 = new Module("CFM2175", "Computing Science and Mathematics", 36);
        mc.addModule(cfm2175);
        Module cfp2125 = new Module("CFP2125", "Project 1", 87);
        mc.addModule(cfp2125);
        Module cfs2101 = new Module("CFS2101", "Computer Organisation and Architecture", 78);
        mc.addModule(cfs2101);
        Module cfs2102 = new Module("CFS2102", "Computer Network Fundamentals", 92);
        mc.addModule(cfs2102);



        System.out.println("GET A SINGLE MODULE");
        System.out.println("PRINTING MODULE");
        try{
            Module module = mc.searchModules("CFS2160");
            System.out.println(module);
        }catch(ModuleNotFoundException m){
            System.out.println(m.getMessage());
        }
        System.out.println("\n");
        System.out.println("GET A NOT PRESENT MODULE");
        System.out.println("PRINTING EXCEPTION MESSAGE");
        try{
            Module module = mc.searchModules("CFS2165");
            System.out.println(module);
        }catch(ModuleNotFoundException m){
            System.out.println(m.getMessage());
        }

        System.out.println("TEST EXCEPTION");
        try{
            ArrayList<Module> m = mc.getPassedModules(-1000);
            for(Module mod : m){
                System.out.println(mod);
            }
        }catch(Exception n){
            System.out.println(n.getMessage());
        }
    }
}
