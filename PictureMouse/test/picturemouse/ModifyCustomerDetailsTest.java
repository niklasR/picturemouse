/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  May not need this due to similarities to Database class. Not finished!!
 * @author John
 */
public class ModifyCustomerDetailsTest {
    
    public ModifyCustomerDetailsTest() {
    }

    /**
     * Test of doIt method, of class ModifyCustomerDetails.
     */
    @Test
    public void testDoIt() {
        System.out.println("doIt");
        String oldUsername = "";
        String newUsername = "";
        String newPassword = "";
        boolean newIsAdmin = false;
        ArrayList<CinemaTicket> newTicketsPurchased = null;
        String newFirstName = "";
        ModifyCustomerDetails instance = new ModifyCustomerDetails();
        instance.doIt(oldUsername, newUsername, newPassword, newIsAdmin, newTicketsPurchased, newFirstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
