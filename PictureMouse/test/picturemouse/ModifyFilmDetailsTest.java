/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse;

import java.io.File;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * May not need this due to similarities to Database class. Not finished!!
 * @author John
 */
public class ModifyFilmDetailsTest {
    
    public ModifyFilmDetailsTest() {
    }

    /**
     * Test of doIt method, of class ModifyFilmDetails.
     */
    @Test
    public void testDoIt() {
        System.out.println("doIt");
        int oldfilmId = 0;
        int newFilmId = 0;
        String newName = "";
        File newTrailer = null;
        String newSynopsis = "";
        ArrayList<Screening> newScreenings = null;
        ModifyFilmDetails instance = new ModifyFilmDetails();
        instance.doIt(oldfilmId, newFilmId, newName, newTrailer, newSynopsis, newScreenings);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
