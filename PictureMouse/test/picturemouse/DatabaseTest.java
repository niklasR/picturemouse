/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import static org.junit.Assert.*;
import org.junit.Test;

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
        ArrayList<Screening> screenings = new ArrayList<>();
        Time t = new Time(9, 30, 0);
        Date date = new Date();
        HashMap<Integer, String> plan = new HashMap(100);
        plan.put(1,"jevery21");
        Screening s1 = new Screening(1, t, date, 1, plan);
        screenings.add(s1);
        f.modify(1, "Batman", null, "About a young man who beats people up!", screenings);
        database.save(f);
        assertEquals(1, database.getFilms().get(0).getFilmId());
        
        Account c = null;
        ArrayList<CinemaTicket> cinemaTickets = new ArrayList<>();
        CinemaTicket c1 = new CinemaTicket(1, 1);
        cinemaTickets.add(c1);
        c.modify("jevery21", "123456", false, cinemaTickets, "John");
        database.save(f);
        assertEquals(1, database.getAccounts().get(0).getUsername());
        
        Review r = null;
        r.modify((short)5, 1, "It was fantastic. A must see!", "jevery21", 1);
        assertEquals(1, database.getReviews().get(0).getReviewId());
    }
    
    /**
     * Test of saveToFile method, of class Database.
     */
    @Test
    public void testSaveToFile() {
        database.saveToFile();
    }

    /**
     * Test of loadFromFile method, of class Database.
     */
    @Test
    public void testLoadFromFile() throws Exception 
    {
        String previousNewsletter = database.getNewsletter().display();
        int previousFilm = database.getFilms().get(0).getFilmId();
        String previousAccount = database.getAccounts().get(0).getUsername();
        int previousReview = database.getReviews().get(0).getReviewId();
        database.loadFromFile();
        assertEquals(previousNewsletter, database.getNewsletter().display());
        assertEquals(previousFilm, database.getFilms().get(0).getFilmId());
        assertEquals(previousAccount, database.getAccounts().get(0).getUsername());
        assertEquals(previousReview, database.getReviews().get(0).getReviewId());
    }
    
    /**
     * Test of lookupFilm method, of class Database.
     */
    @Test
    public void testLookupFilm() {
        int filmId = 1;
        Film result = database.lookupFilm(filmId);
        assertEquals(1, result.getFilmId());
        assertEquals(null, database.lookupFilm(filmId));
    }

    /**
     * Test of lookupReview method, of class Database.
     */
    @Test
    public void testLookupReview() {
        int reviewId = 1;
        Review result = database.lookupReview(reviewId);
        assertEquals(1, result.getReviewId());
        assertEquals(null, database.lookupReview(reviewId));
    }

    /**
     * Test of lookupAccount method, of class Database.
     */
    @Test
    public void testLookupAccount() {
        String username = "jevery21";
        Account result = database.lookupAccount(username);
        assertEquals("jevery21", result.getUsername());
        assertEquals(null, database.lookupAccount(username));
    }

}