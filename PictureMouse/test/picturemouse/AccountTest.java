/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package picturemouse;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Time;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author jakecarr
 */
public class AccountTest {
    Account account;
    Screening[] screenings = new Screening[3];
    CinemaTicket[] tickets = new CinemaTicket[9];
    
    public AccountTest() {
        //Creating screenings
        for(int i=0; i<3; i++){
            screenings[i] = new Screening(i+1, new Time(15+i, 0, 0), new Date(2014, 3, 10+i), 1, new HashMap<Integer, String>());
        }
        //Creating cinema tickets
        for(int i=0; i<9; i++){
            tickets[i] = new CinemaTicket(i*2, screenings[i%3].getScreeningId());
        }
    }
    
    @Before
    public void setUp() {
        account = new Account("username1", "password1", true, new ArrayList<CinemaTicket>(), "Jake", 1234567890123456L);
        for(int i=0; i<5; i++){
            account.addTicket(tickets[i]);
        }
    }
    
    @After
    public void tearDown() {
        account = null;
    }

    /**
     * Test of modify method, of class Account.
     */
    @Test
    public void testModify() {
        System.out.println("modify");
        String username = "modifiedUsername";
        String password = "modifiedPassword";
        Boolean isAdmin = false;
        ArrayList<CinemaTicket> ticketsPurchased = null;
        String firstName = "modifiedFN";
        long creditCardNo = 6543210987654321L;
        Account instance = account;
        instance.modify(username, password, isAdmin, ticketsPurchased, firstName, creditCardNo);
        //Testing that the attributes have changed to the new values
        assertEquals(username, instance.getUsername());
        assertEquals(password, instance.getPassword());
        assertEquals(isAdmin, instance.getAdminSetting());
        assertEquals(ticketsPurchased, instance.getTicketsPurchased());
        assertEquals(firstName, instance.getFirstName());
        assertEquals(creditCardNo, instance.getCreditCardNo());
    }

    /**
     * Test of getUsername method, of class Account.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Account instance = account;
        String expResult = "username1";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Account.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Account instance = account;
        String expResult = "password1";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of addTicket method, of class Account.
     */
    @Test
    public void testAddTicket() {
        System.out.println("addTicket");
        CinemaTicket ticket1 = tickets[5];
        CinemaTicket ticket2 = tickets[6];
        CinemaTicket ticket3 = tickets[7];
        CinemaTicket ticket4 = tickets[8];
        Account instance = account;
        instance.addTicket(ticket1);
        instance.addTicket(ticket4);
        instance.addTicket(ticket3);
        instance.addTicket(ticket2);
        assertEquals(tickets[0], instance.getTicketsPurchased().get(0));
        assertEquals(tickets[1], instance.getTicketsPurchased().get(1));
        assertEquals(tickets[2], instance.getTicketsPurchased().get(2));
        assertEquals(tickets[3], instance.getTicketsPurchased().get(3));
        assertEquals(tickets[4], instance.getTicketsPurchased().get(4));
        assertEquals(ticket1, instance.getTicketsPurchased().get(5));
        assertEquals(ticket4, instance.getTicketsPurchased().get(6));
        assertEquals(ticket3, instance.getTicketsPurchased().get(7));
        assertEquals(ticket2, instance.getTicketsPurchased().get(8));
    }

    /**
     * Test of signOn method, of class Account.
     */
    @Test
    public void testSignOn() {
        System.out.println("signOn");
        Account instance = account;
        assertEquals(false, account.checkSignedOn());
        instance.signOn();
        assertEquals(true, account.checkSignedOn());
    }

    /**
     * Test of signOff method, of class Account.
     */
    @Test
    public void testSignOff() {
        System.out.println("signOff");
        Account instance = account;
        instance.signOn();
        assertEquals(true, account.checkSignedOn());
        instance.signOff();
        assertEquals(false, account.checkSignedOn());
    }

    /**
     * Test of checkSignedOn method, of class Account.
     */
    @Test
    public void testCheckSignedOn() {
        System.out.println("checkSignedOn");
        Account instance = account;
        boolean expResult = false;
        boolean result = instance.checkSignedOn();
        assertEquals(expResult, result);
    }
    
}
