package picturemouse;

import java.io.File;
import java.util.ArrayList;

/**
 * Generated by StarUML(tm) Java Add-In.
 * This class is instantiated by the front-end and the methods within it 
 * will be called by the front-end to output to the user or input information
 * given by the user into the database. Allows administrators to modify 
 * details of films.
 * 
 * @version 24/02/2014
 * @author John Every
 */


public class ModifyFilmDetails
{
    /**
     * This method changes the values of the attributes for a chosen film
     * to new values entered by the user. Then it saves the new film 
     * object's state into the database.
     * 
     * @param oldfilmId This corresponds to the old value of the filmId 
     *                  field for the chosen film.
     * @param newFilmId New filmId field.
     * @param newName New name field.
     * @param newTrailer New trailer field.
     * @param newSynopsis New synopsis field.
     * @param newScreenings New screenings field(elements are 
     *                      inserted, adapted or removed in front-end).
     */
    public void doIt(int oldfilmId, int newFilmId, String newName, 
            File newTrailer, String newSynopsis, 
            ArrayList<Screening> newScreenings)
    {
        Database database = Database.getInstance();
        Film film = database.lookupFilm(oldfilmId, true);
        film.modify(newFilmId, newName, newTrailer, newSynopsis, 
                                                newScreenings);
        database.save(film);
    }
    
    // various methods to help produce the front-end for this use case will
    // be defined later.
}
