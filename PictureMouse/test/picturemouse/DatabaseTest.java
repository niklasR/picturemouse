/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse;

import java.io.File;
import java.io.IOException;
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
    public void testDatabase() throws IOException, ClassNotFoundException {
        Newsletter n = new Newsletter();
        n.set("John Every");
        database.save(n);
        assertEquals("John Every", database.getNewsletter().display());
        
        Film f = new Film();
        ArrayList<Screening> screenings = new ArrayList<>();
        Time t = new Time(9, 30, 0);
        Date date = new Date();
        HashMap<Integer, String> plan = new HashMap(100);
        plan.put(1,"jevery21");
        Screening s1 = new Screening(1, t, date, 1, plan);
        screenings.add(s1);
        f.modify(1, "Batman", new File(""), "About a young man who beats people up!", screenings);
        database.save(f);
        assertEquals(1, database.getFilms().get(0).getFilmId());
        
        Account c = new Account();
        ArrayList<CinemaTicket> cinemaTickets = new ArrayList<>();
        CinemaTicket c1 = new CinemaTicket(1, 1);
        cinemaTickets.add(c1);
        c.modify("jevery21", "123456", false, cinemaTickets, "John", 1234567894567349L);
        database.save(c);
        assertEquals("jevery21", database.getAccounts().get(0).getUsername());
        
        Review r = new Review();
        r.modify((short)5, 1, "It was fantastic. A must see!", "jevery21", 1);
        database.save(r);
        assertEquals(1, database.getReviews().get(0).getReviewId());
        
        database.saveToFile();
        
        String previousNewsletter = database.getNewsletter().display();
        int previousFilm = database.lookupFilm(1,false).getFilmId();
        String previousAccount = database.lookupAccount("jevery21",false).getUsername();
        int previousReview = database.lookupReview(1,false).getReviewId();
        database.loadFromFile();
        assertEquals(previousNewsletter, database.getNewsletter().display());
        assertEquals(previousFilm, database.lookupFilm(1,false).getFilmId());
        assertEquals(previousAccount, database.lookupAccount("jevery21",false).getUsername());
        assertEquals(previousReview, database.lookupReview(1,false).getReviewId());
        
        int filmId = 1;
        assertEquals(filmId, database.lookupFilm(filmId, false).getFilmId());
        assertEquals(filmId, database.lookupFilm(filmId, false).getFilmId());
        Film result1 = database.lookupFilm(filmId, true);
        assertEquals(1, result1.getFilmId());
        assertEquals(null, database.lookupFilm(filmId, false));
        
        int reviewId = 1;
        assertEquals(reviewId, database.lookupReview(reviewId, false).getReviewId());
        assertEquals(reviewId, database.lookupReview(reviewId, false).getReviewId());
        Review result2 = database.lookupReview(reviewId, true);
        assertEquals(reviewId, result2.getReviewId());
        assertEquals(null, database.lookupReview(reviewId, false));
        
        String username = "jevery21";
        assertEquals(username, database.lookupAccount(username, false).getUsername());
        assertEquals(username, database.lookupAccount(username, false).getUsername());
        Account result3 = database.lookupAccount(username, true);
        assertEquals(username, result3.getUsername());
        assertEquals(null, database.lookupAccount(username, false));
    }
 
}
