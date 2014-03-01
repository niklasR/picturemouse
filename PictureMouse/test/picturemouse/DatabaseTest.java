/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;
import java.sql.Time;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author John
 */
public class DatabaseTest {
    Database database = Database.getInstance();
    /**
     * Test of save method, of class Database.
     */
    @Test
    public void testSave() {
        Newsletter n = null;
        n.set("John Every");
        database.save(n);
        assertEquals("John Every", database.getNewsletter().display());
        
        Film f = null;
        ArrayList<Screening> screenings = new ArrayList<Screening>();
        Time t = new Time(9, 30, 0);
        Date date = new Date();
        HashMap<Integer, String> plan = new HashMap(100);
        plan.put(1,"jevery21");
        Screening s1 = new Screening(1, t, date, 1, plan);
        screenings.add(s1);
        f.modify(1, "Batman", null, "About a young man who beats people up!", screenings);
        database.save(f);
        assertEquals(1, f.getFilmId());
        
        Account c = null;
        ArrayList<CinemaTicket> cinemaTickets = new ArrayList<CinemaTicket>();
        CinemaTicket c1 = new CinemaTicket(1, 1);
        cinemaTickets.add(c1);
        c.modify("jevery21", "123456", false, cinemaTickets, "John");
        database.save(f);
        assertEquals(1, c.getUsername());
        
        Review r = null;
        r.modify((short)5, 1, "It was fantastic. A must see!", "jevery21", 1);
    }
    
        /**
     * Test of lookupFilm method, of class Database.
     */
    @Test
    public void testLookupFilm() {
        System.out.println("lookupFilm");
        int filmId = 0;
        Database instance = null;
        Film expResult = null;
        Film result = instance.lookupFilm(filmId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookupReview method, of class Database.
     */
    @Test
    public void testLookupReview() {
        System.out.println("lookupReview");
        int reviewId = 0;
        Database instance = null;
        Review expResult = null;
        Review result = instance.lookupReview(reviewId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookupAccount method, of class Database.
     */
    @Test
    public void testLookupAccount() {
        System.out.println("lookupAccount");
        String username = "";
        Database instance = null;
        Account expResult = null;
        Account result = instance.lookupAccount(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveToFile method, of class Database.
     */
    @Test
    public void testSaveToFile() {
        System.out.println("saveToFile");
        Database instance = null;
        instance.saveToFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadFromFile method, of class Database.
     */
    @Test
    public void testLoadFromFile() throws Exception {
        System.out.println("loadFromFile");
        Database instance = null;
        instance.loadFromFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
