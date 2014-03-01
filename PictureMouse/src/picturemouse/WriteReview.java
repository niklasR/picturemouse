package picturemouse;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : WriteReview.java
//  @ Date : 24/02/2014
//  @ Author : 
//
//




/**
 * At this point the user has already chosen a film
 * 
 * @author Ollie Coleshill
 */
public class WriteReview
{
    
        Database db = Database.getInstance();
    
	public void doIt(short stars, String text, String username, int filmId)
	{
            // generate this ourselves.
            int reviewID = db.getReviews().size();
                       
            //Create new review object
            Review review = new Review();
            //Write review
            review.modify(stars, reviewID, text, username, filmId);
            
            db.save(review);
	
	}
}
