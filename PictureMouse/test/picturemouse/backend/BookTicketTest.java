/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package picturemouse.backend;

import picturemouse.backend.BEAccount;
import picturemouse.backend.BEBookTicket;
import picturemouse.backend.BEDatabase;
import picturemouse.backend.BECinemaTicket;
import picturemouse.backend.BEFilm;
import picturemouse.backend.BEScreening;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
    BEDatabase database;
    BEFilm film;
    BEScreening screening;
    BEAccount account;
    
    public BookTicketTest() {
        //Creating database
        database = BEDatabase.getInstance();
        //Creating Screening
        screening = new BEScreening(1, new Time(15, 0, 0), new Date(2014, 3, 10), 1, new HashMap<Integer, String>());
        ArrayList<BEScreening> screenings = new ArrayList<>();
        screenings.add(screening);
        //Creating Film
        film = new BEFilm(1, "film", new File(""), "synopsis", screenings);
        //Creating Account
        account = new BEAccount("username1", "password1", true, new ArrayList<BECinemaTicket>(), "Jake", 1234567890123456L);
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
     * Test of doIt method, of class BookTicket.
     */
    @Test
    public void testDoIt() {
        System.out.println("doIt");
        int filmId = 1;
        int screeningId = 1;
        int seat = 5;
        String username = "username1";
        BEBookTicket instance = new BEBookTicket();
        instance.doIt(filmId, screeningId, seat, username);
        //Check that account has added ticket
        BECinemaTicket ticket = account.getTicketsPurchased().get(0);
        assertEquals(screeningId, ticket.getScreeningId());
        assertEquals(seat, ticket.getSeatNumber());
        //Check that the seating plan is updated
        assertEquals(false, screening.available(seat));
        assertEquals(username, screening.getUsername(seat));
    }
    
}
