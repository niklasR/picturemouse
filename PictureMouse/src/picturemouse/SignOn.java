package picturemouse;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : SignOn.java
//  @ Date : 24/02/2014
//  @ Author : 
//
//




public class SignOn
{
    
        private boolean signedIn = false;
        private String u;
        private String p;
        Database db;
    
	public void doIt()
	{
            
            //Check signed in
            
            if (signedIn != true){
                ask(u, p);
            }
            	
	}
        
        public void ask(String u, String p){
            
            //Connect to database
            
            
            //Ask for username
            
            System.out.println("Username: ");
            
            //Ask for password
            
            System.out.println("Password: ");
            
            //Use Account for temporary 

            
            //Check username exists in the database
            //Iterate through ArrayList to check if the username exists
            //Else RefuseSignOn
            Account account = db.lookupAccount(u);
            
            //Check password matches password in Account object
            if (p.equals(account.getPassword())){
                signedIn = true;
            } else {
            //Else RefuseSignOn
            RefuseSignOn.doIt();
            }
        }
}
