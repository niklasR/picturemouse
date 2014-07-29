package picturemouse.backend;
import java.io.Serializable;
/**
 * 
 * @author Oliver Coleshill & Niklas Rahmel
 * @version 02/03/2014
 */

public class BEReview implements Serializable
{       
        /**
         * Rating of film for review.
         */
	private short stars;
        /**
         * ID of review.
         */
	private int reviewId;
        /**
         * Content of review.
         */
	private String text;
        /**
         * Username of Review.
         */
	private String username;
        /**
         * ID of film review is for.
         */
	private int filmId;
        
        /**
         * Method to update review.
         * @param stars The rating of the film
         * @param reviewId The ID of the review
         * @param text The content of the review
         * @param username The username of the user who created the review
         * @param filmId The ID of the film
         */
	public void modify(short stars, int reviewId, String text, String username, int filmId)
	{
            this.stars = stars;
            this.reviewId = reviewId;
            this.text = text;
            this.username = username;
            this.filmId = filmId;
	}
        
        /**
         * Method to get ID of review
         * @return ID of review
         */
        public int getReviewId()
        {
            return this.reviewId;
        }
        
        /**
         * Method to get the rating for the review.
         * @return number of stars
         */
        public short getStars()
        {
            return this.stars;
        }        
        
        /**
         * Method to get the content of the review
         * @return Text of review
         */
        public String getText()
        {
            return this.text;
        }
        
        /**
         * Method to get user who wrote the review
         * @return username of creator
         */
        public String getUsername(){
            return this.username;
        }
        
        /**
         * Method to get the ID of the film the review is for
         * @return ID of film
         */
        public int getFilmId()
        {
            return this.filmId;
        }
}
