/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package picturemouse.backend;

import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author niklas
 */
public class CreateTestDatabase {
    
    BEDatabase database;
    
    public CreateTestDatabase() throws IOException{
        
        database = BEDatabase.getInstance();
        
        // Create Newsletter        
        BENewsletter testNewsletter1 = new BENewsletter();
        testNewsletter1.set("This is a test newsletter");            

        database.save(testNewsletter1);

        // Create Films
        // Create Screening
        ArrayList<BEScreening> testScreenings1 = new ArrayList<>();
        HashMap<Integer, String> testSeatingPlan = new HashMap<>();
        testSeatingPlan.put(1, "testUser1");
        testSeatingPlan.put(2, "Administrator");
        BEScreening testScreening1 = new BEScreening(1, new Time(9, 30, 0), new Date(114, 5, 1), 1, testSeatingPlan);
        testScreenings1.add(testScreening1);

        BEFilm testFilm1 = new BEFilm(1, "Test Film 1", "", "Test Synopsis 1", testScreenings1);
        database.save(testFilm1);



        // Create Account
        // Create tickets purchased
        BECinemaTicket testTicket1 = new BECinemaTicket(1, 1, 1);
        ArrayList<BECinemaTicket> testCinemaTickets = new ArrayList<>();
        BEAccount testAccount1 = new BEAccount("testUser1", "testPassword1", false, testCinemaTickets, "Username 1", 1234567890123456L);

        database.save(testAccount1);

        // Create Admin
        // Create tickets purchased
        BECinemaTicket testTicket2 = new BECinemaTicket(2, 1, 1);
        ArrayList<BECinemaTicket> testCinemaTickets2 = new ArrayList<>();
        BEAccount testAdmin = new BEAccount("Administrator", "pw", true, testCinemaTickets2, "Admin", 1234567890123456L);

        database.save(testAdmin);

        // Create Review
        BEReview r = new BEReview();
        r.modify((short)5, 1, "It was fantastic. A must see!", "testUser1", 1);
        database.save(r);

        // Save Database
        database.saveToFile();
    }
}
