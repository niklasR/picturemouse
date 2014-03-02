package picturemouse;
import java.io.Serializable;

/**
 * Some of the code was generated by StarUML(tm) Java Add-In. Class for every 
 * Cinema Ticket that is booked. This class should allow the user to print and 
 * contain what seat and screening the ticket corresponds to.
 * 
 * @version 02/03/2014
 * @author jakecarr
 */
public class CinemaTicket implements Serializable
{
    private int seat;
    private int screeningId;

    public CinemaTicket(int seat, int screeningId) {
        this.seat = seat;
        this.screeningId = screeningId;
    }

    /**
     * Return method for the seat number.
     * 
     * @return Seat number of ticket
     */
    public int getSeatNumber(){
        return seat;
    }

    /**
     * Return method for the screening.
     * 
     * @return screening of ticket
     */
    public int getScreeningId(){
        return screeningId;
    }
}
