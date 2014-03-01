package picturemouse;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Screening.java
//  @ Date : 24/02/2014
//  @ Author : 
//
//

import java.sql.Time;
import java.util.Date;
import java.util.HashMap;

public class Screening
{
    /**
     * ScreeningId uniquely defines a Screening object as there could be 
     * multiple screenings that have equal values for the other attributes.
     */
        private int screeningId;
	private Time time;
	private Date date;
	private int filmId;
	private HashMap<Integer,String> seatingPlan;
        
        public Screening(int screeningId, Time time, Date date, int filmId, HashMap<Integer, String> seatingPlan){
            this.screeningId = screeningId;
            this.time = time;
            this.date = date;
            this.filmId = filmId;
            this.seatingPlan = seatingPlan;
        }
        
        public boolean available(int seatNumber) {
            return !seatingPlan.containsKey(seatNumber);
        }
        
        public void book(int seatNumber, String username) {
            seatingPlan.put(seatNumber, username);
        }
        
        public int getScreeningId() {
            return screeningId;
        }
}
