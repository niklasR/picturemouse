package picturemouse.backend;

import java.sql.Time;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Some of the code has been generated by StarUML(tm) Java Add-In.
 * This class is to allow the system to book tickets for customers. It acts as
 * a link between the front-end and the back-end of the system.
 * @author jakecarr
 */
public class BEBookTicket
{
    /**
     * Method for when a ticket needs to be booked. This method will be called
     * from the front-end of the system, where the film, screening, seat and
     * account information will be collected. The method will create the ticket
     * and then save, within the database, the booked ticket if it is available.
     * It will need to saved within the Account purchased tickets list and
     * within the Screening seating plan.
     * 
     * @param filmId filmId of film that the ticket is for
     * @param screeningId screeningId of screening the ticket is for
     * @param seat seat number that the ticket is for
     * @param username username of account that have purchased the ticket
     */
    public void doIt(int filmId, int screeningId, int seat, String username)
    {
        //Finding the database, account, film and screening
        System.out.println("ScreeningId: " + screeningId);
        System.out.println("filmId: " + screeningId);
        BEDatabase database = BEDatabase.getInstance();
        BEAccount account = database.lookupAccount(username, false);
        BEFilm film = database.lookupFilm(filmId, false);
        System.out.println("film name: " + film.getFilmName());
        BEScreening screening = film.lookupScreening(screeningId);
        //Creating the CinemaTicket
        BECinemaTicket ticket = new BECinemaTicket(seat, screeningId, filmId);
        //If the seat in screening is availible then book
        if(screening.available(seat)) {
            account.addTicket(ticket);
            screening.book(seat, username);
        }
    }
    
    /**
     * Method to return the screenings for a particular Film.
     * This is so the frontend BookTicket class does not need to
     * directly interact with the database.
     * 
     * @param filmId
     * @return String array of screenings for film
     */
    public String[] findScreenings(int filmID){
        
        //Finding the database, account, film and screening
        BEDatabase database = BEDatabase.getInstance();
        
        //Finds film
        BEFilm film = database.lookupFilm(filmID, false);
        if (film == null){
            return new String[0];
        }
        if (film.getScreenings() == null){
            System.out.println("null");
        }
        System.out.println(film.getScreenings());
        ArrayList<BEScreening> screenings = film.getScreenings();
        
        //Returned arrray where length = number of screenings
        String[] screeningStrings = new String[screenings.size()];
        
        //Creating a data formatter
        Format formatter = new SimpleDateFormat("dd-MM-yyyy");
        
        //Iterate through the screenings
        for(int i=0; i<screenings.size(); i++){
            BEScreening screening = screenings.get(i);
            int screeningID = screening.getScreeningId();
            Date screeningDate = screening.getDate();
            Time screeningTime = screening.getTime();
            String formattedDate = formatter.format(screeningDate);
            screeningStrings[i] = screeningID+", "+formattedDate+", "+screeningTime.toString();
        }
        
        return screeningStrings;
    }
    
    /**
     * Method to return the available seats for a particular Screening.
     * This is so the frontend BookTicket class does not need to
     * directly interact with the database.
     * The seats are returned in the form of a String array.
     * 
     * @param filmId
     * @param screeningID
     * @return String array of available seats for a screening
     */
    public String[] findSeats(int filmID, int screeningID){
        
        //Finding the database, account, film and screening
        BEDatabase database = BEDatabase.getInstance();
        
        //Finds screening
        BEFilm film = database.lookupFilm(filmID, false);
        BEScreening screening = film.lookupScreening(screeningID);
        
        int[] availableSeatsInt = screening.getAvailibleSeats();
        String[] availableSeats = new String[availableSeatsInt.length];
        
        //Converting int array to String array
        for (int i=0; i<availableSeatsInt.length; i++){
            availableSeats[i] = String.valueOf(availableSeatsInt[i]);
        }
        
        return availableSeats;
    }
}
