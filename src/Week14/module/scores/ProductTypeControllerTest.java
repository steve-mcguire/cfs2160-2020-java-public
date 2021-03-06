package Week14.module.scores;

import Week14.module.scores.exception.ModuleNotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProductTypeControllerTest {
    private ModuleController mc;

    @BeforeEach
    void setUp() {
        mc = new ModuleController();
        Module cfs2160 = new Module("CFS2160", "Software Design and Development", 40);
        mc.addModule(cfs2160);
        Module cfm2175 = new Module("CFM2175", "Computing Science and Mathematics", 36);
        mc.addModule(cfm2175);
        Module cfp2125 = new Module("CFP2125", "Project 1", 87);
        mc.addModule(cfp2125);
        Module cfs2101 = new Module("CFS2101", "Computer Organisation and Architecture", 78);
        mc.addModule(cfs2101);
        Module cfs2102 = new Module("CFS2102", "Computer Network Fundamentals", 92);
        mc.addModule(cfs2102);
    }


    @Test
    void searchModules() throws ModuleNotFoundException {
        //Check returned object is of correct type
        Module result = mc.searchModules("CFS2160");
        assertEquals(Module.class, result.getClass());

        //Check to see if returned Module is correct instance
        assertEquals("CFS2160", result.getCode());

        //Check to see that incorrect search term throw exception
        assertThrows(ModuleNotFoundException.class, () -> {
            mc.searchModules("CFS2165");
        });
    }

    @Test
    void getPassedModules() throws Exception {
        //check for correct number of modules in passed modules
        ArrayList<Module> result = mc.getPassedModules(40);
        assertEquals(4, result.size());
    }
}