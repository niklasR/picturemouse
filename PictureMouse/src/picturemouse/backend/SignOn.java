package picturemouse.backend;

/**
 * Some of the code has been generated by StarUML(tm) Java Add-In.
 * This class will interact with the front end to allow
 * the user to sign in. The front end will run a loop until
 * doIt returns true (indicating that the login has been
 * successful).
 * 
 * @author Oliver Coleshill
 */

public class SignOn
{
    
    /**
     * Check whether the account is signed on
     * If yes, return true
     * If not, return false so the front end loop can ask again
     */
    public boolean doIt(String u, String p)
	{
            
            Database database = Database.getInstance();
            
                //If the username exists, check if the user is signed on
                
            Account account = database.lookupAccount(u, false);
            if (!account.checkSignedOn())
            {

                if (p.equals(account.getPassword())){
                    account.signOn();
                }

                return false;
            }

            //This means they are signed in, so return true
            else 
            {
                return true;
            }
        }

}
