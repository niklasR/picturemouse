package picturemouse.backend;


  /** Some of the code has been generated by StarUML(tm) Java Add-In.
   * This class is for Administrators to modify Reviews already written.
   * 
   * @version 01/03/2014
   * @author Niklas Rahmel
   */

public class BEModifyReview
{
    /**
     * This method changes the values of the attributes for a chosen review
     * to new values entered by the user. Then it saves the new review
     * object's state into the database.
     * 
     * @param oldReviewId This corresponds to the old value of the reviewId 
     *                    field for the chosen film.
     * @param newReviewId New reviewId field.
     * @param newStars New stars field.
     * @param newText New text field.
     * @param newUsername New username field.
     * @param newFilmId New filmId field.
     */
    public void doIt(int oldReviewId, int newReviewId, short newStars, String newText, String newUsername, int newFilmId)
    {
        
        /**
         * Database object storing all the reviews
         */
        
        BEDatabase database = BEDatabase.getInstance();
        BEReview review = database.lookupReview(oldReviewId, true);
        review.modify(newStars, newReviewId, newText, newUsername, newFilmId);
        database.save(review);
    }
}
    
    /* various methods to help produce the front-end for this use case will
    be defined later.
             Old contents of review to be given to GUI to be displayed to
            Admin to modify it.
            
            Short starsOld;
            String textOld;
            int byUserIDOld;
            int filmIDOld;
            
           
            
            Variables to store modified values from Admin
           Short stars;
            String text;
            int byUserID;
            int filmID;
            
            Code to get data input by Admin in GUI to initialise variables
            declared above
            
            /**
             * Save modified review in database.
             * This only works if reviewID == index of reviewID in 'reviews'
             * in Database, otherwise would have to iterate over all reviews
             * to find review with correct ID or save indices of reviewIDs
             * separately.
             */
            /*db.getReviews().get(reviewID).modify(stars, reviewID, text, byUserID, filmID);/*
	}*/