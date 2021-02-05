package Week14.module.scores;

public class ModuleMain {
    public static void main(String[] args) throws ModuleNotFoundException {
        ModuleController mc = new ModuleController();
        Module cfs2160 = new Module("CFS2160", "Software Design and Development", 96);
        mc.addModule(cfs2160);
        Module cfm2175 = new Module("CFM2175", "Computing Science and Mathematics", 90);
        mc.addModule(cfm2175);
        Module cfp2125 = new Module("CFP2125", "Project 1", 87);
        mc.addModule(cfp2125);
        Module cfs2101 = new Module("CFS2101", "Computer Organisation and Architecture", 78);
        mc.addModule(cfs2101);
        Module cfs2102 = new Module("CFS2102", "Computer Network Fundamentals", 92);
        mc.addModule(cfs2102);


        System.out.println("TESTING THE METHODS");
        System.out.println("PRINTING MODULES");
        try{
            System.out.println(mc.printModules());
        }catch(ModuleNotFoundException m){
            System.out.println(m.getMessage());
        }
        System.out.println("SORTED");
        mc.sortModules();
        System.out.println("PRINTING MODULES");
        try{
            System.out.println(mc.printModules());
        }catch(ModuleNotFoundException m){
            System.out.println(m.getMessage());
        }

        System.out.println("SET A MODULE INACTIVE");
        cfm2175.setActive(false);
        mc.sortModules();
        System.out.println("PRINTING MODULES");
        try{
            System.out.println(mc.printModules());
        }catch(ModuleNotFoundException m){
            System.out.println(m.getMessage());
        }

        System.out.println("PURGE INACTIVE MODULES");
        mc.purgeModule();
        mc.sortModules();
        System.out.println("PRINTING MODULES");
        try{
            System.out.println(mc.printModules());
        }catch(ModuleNotFoundException m){
            System.out.println(m.getMessage());
        }

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
    }
}
