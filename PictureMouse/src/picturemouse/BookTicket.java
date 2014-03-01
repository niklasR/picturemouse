package picturemouse;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : BookTicket.java
//  @ Date : 24/02/2014
//  @ Author : 
//
//

public class BookTicket
{
	public void doIt(int filmId, int screeningId, int seat, String username)
	{
            //Finding the database, account, film and screening
            Database database = Database.getInstance();
            Account account = database.lookupAccount(username);
            Film film = database.lookupFilm(filmId);
            Screening screening = film.lookupScreening(screeningId);
            //Creating the CinemaTicket
            CinemaTicket ticket = new CinemaTicket(seat, screening);
            //If the seat in screening is availible then book
            if(screening.available(seat)) {
                account.addTicket(ticket);
                screening.book(seat, username);
            }
	}
}
