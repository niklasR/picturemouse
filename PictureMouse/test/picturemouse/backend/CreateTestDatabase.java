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
        HashMap<Integer, String> testSeatingPlan1 = new HashMap<>();
        testSeatingPlan1.put(1, "testUser1");
        testSeatingPlan1.put(2, "Administrator");
        BEScreening testScreening1 = new BEScreening(1, new Time(9, 30, 0), new Date(114, 5, 1), 0, testSeatingPlan1);
        testScreenings1.add(testScreening1);

        BEFilm testFilm1 = new BEFilm(0, "Test Film 1", "", "Test Synopsis 1", testScreenings1);
        database.save(testFilm1);
        
        // Create Screening
        ArrayList<BEScreening> testScreenings2 = new ArrayList<>();
        HashMap<Integer, String> testSeatingPlan2 = new HashMap<>();
        testSeatingPlan2.put(5, "testUser1");
        testSeatingPlan2.put(11, "Administrator");
        BEScreening testScreening2 = new BEScreening(2, new Time(9, 30, 0), new Date(114, 5, 2), 1, testSeatingPlan2);
        testScreenings2.add(testScreening2);

        ArrayList<BEScreening> testScreenings3 = new ArrayList<>();
        HashMap<Integer, String> testSeatingPlan3 = new HashMap<>();
        testSeatingPlan3.put(23, "testUser1");
        testSeatingPlan3.put(1, "Administrator");
        BEScreening testScreening3 = new BEScreening(3, new Time(11, 30, 0), new Date(114, 5, 2), 1, testSeatingPlan3);
        testScreenings2.add(testScreening3);
        
        BEFilm testFilm2 = new BEFilm(1, "Test Film 2", "", "Test Synopsis 2", testScreenings2);
        database.save(testFilm2);



        // Create Account
        // Create tickets purchased
        BECinemaTicket testTicket1 = new BECinemaTicket(1, 1, 0);
        BECinemaTicket testTicket2 = new BECinemaTicket(5, 2, 0);
        BECinemaTicket testTicket3 = new BECinemaTicket(23, 3, 1);
        ArrayList<BECinemaTicket> testCinemaTickets1 = new ArrayList<>();
        testCinemaTickets1.add(testTicket1);
        testCinemaTickets1.add(testTicket2);
        testCinemaTickets1.add(testTicket3);        
        BEAccount testAccount1 = new BEAccount("testUser1", "testPassword1", false, testCinemaTickets1, "Username 1", 1234567890123456L);

        database.save(testAccount1);

        // Create Admin
        // Create tickets purchased
        BECinemaTicket testTicket4 = new BECinemaTicket(2, 1, 0);
        BECinemaTicket testTicket5 = new BECinemaTicket(11, 2, 1);
        BECinemaTicket testTicket6 = new BECinemaTicket(1, 3, 1);
        ArrayList<BECinemaTicket> testCinemaTickets2 = new ArrayList<>();
        testCinemaTickets2.add(testTicket4);
        testCinemaTickets2.add(testTicket5);
        testCinemaTickets2.add(testTicket6);
        BEAccount testAdmin = new BEAccount("Administrator", "Liverpool8", true, testCinemaTickets2, "Admin", 1234567890123456L);

        database.save(testAdmin);

        // Create Review
        BEReview r1 = new BEReview();
        r1.modify((short)5, 1, "It was fantastic. A must see!", "testUser1", 0);
        database.save(r1);
        // Create Review
        BEReview r2 = new BEReview();
        r2.modify((short)4, 2, "Very good film", "testUser1", 0);
        database.save(r2);
        // Create Review
        BEReview r3 = new BEReview();
        r3.modify((short)1, 3, "So Boring! Would rather watch paint dry!", "testUser1", 1);
        database.save(r3);
        // Create Review
        BEReview r4 = new BEReview();
        r4.modify((short)2, 4, "I fell asleep", "testUser1", 1);
        database.save(r4);

        // Save Database
        database.saveToFile();
        
    }
    
    public static void main(String args[]) throws IOException {
        new CreateTestDatabase();
    }
}
