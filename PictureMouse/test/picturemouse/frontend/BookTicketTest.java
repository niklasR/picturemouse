/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package picturemouse.frontend;

import picturemouse.backend.Account;
//import picturemouse.backend.BookTicket;
import picturemouse.backend.Database;
import picturemouse.backend.CinemaTicket;
import picturemouse.backend.Film;
import picturemouse.backend.Screening;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import picturemouse.frontend.BookTicket;

import java.io.File;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/**
 *
 * @author jakecarr
 */
public class BookTicketTest {
    Database database;
    Film film;
    Screening screening;
    Account account;
    
    public BookTicketTest() {
        //Creating database
        database = Database.getInstance();
        //Creating Screening
        screening = new Screening(1, new Time(15, 0, 0), new Date(114, 3, 10, 15, 0, 0), 1, new HashMap<Integer, String>());
        ArrayList<Screening> screenings = new ArrayList<>();
        screenings.add(screening);
        //Creating Film
        film = new Film(1, "film", new File(""), "synopsis", screenings);
        //Creating Account
        account = new Account("username1", "password1", true, new ArrayList<CinemaTicket>(), "Jake", 1234567890123456L);
        BrowseFilms.selectedFilmID = 1;
        //Saving Film to database
        database.save(film);
        database.save(account);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class BookTicket.
     */
    @Test
    public void testMain() {
        
        System.out.println("main");
        Date testDate =new Date(114, 3, 28);
        System.out.println(testDate.toString());
        System.out.println(testDate.toGMTString());
        String[] args = null;
        //BookTicket.main(args);
        new BookTicket().setVisible(true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
