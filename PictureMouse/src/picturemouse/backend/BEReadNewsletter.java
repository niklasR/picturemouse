package picturemouse.backend;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : PictureMouse
//  @ File Name : ReadNewsletter.java
//  @ Date : 24/02/2014
//  @ Author: Oliver Coleshill
//
//




public class BEReadNewsletter{        

	public static String doIt()
	{        
            
            BEDatabase database = BEDatabase.getInstance();
            
            String Content = database.getNewsletter().display();
            
            return Content;
	}
}
