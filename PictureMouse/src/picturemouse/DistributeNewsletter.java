package picturemouse;


/**
 * Some of the code has been generated by StarUML(tm) Java Add-In.
 * This is the component of the system allowing the Administrator to create a
 * new Newsletter and save it in the database for distribution.
 * 
 * @author Niklas Rahmel
 * @version 01/03/2014
 */



public class DistributeNewsletter
{
    
	public void doIt(String content)
	{
<<<<<<< HEAD
=======
            /**
             * database storing all the data.
             */
            Database database = Database.getInstance();
>>>>>>> 384886c88c989c0b2874d29c0b4e87a3c8bf5766
            
            // Code to get content Admin entered in GUI and subsequently
            // intialise variable.
            
            /**
             * Newsletter object to store the newsletter for modification.
             * 
             */
            Newsletter newsletter;
            newsletter = database.getNewsletter();
            newsletter.set(content);
            
            // save newsletter in database.
            database.save(newsletter);
            
            
            
            // Newsletter now ready to be displayed in ReadNewsletter.
	}
}
