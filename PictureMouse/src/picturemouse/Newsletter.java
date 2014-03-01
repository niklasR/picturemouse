package picturemouse;

/**
 * Some of the code has been generated by StarUML(tm) Java Add-In.
 * This is the class to store the newsletter created by an Administrator
 * and provides functions to set it, and to return it to the GUI ti display.
 * 
 * @author Nikals Rahmel
 * @version 01/03/2014
 */




public class Newsletter
{
    /**
     * Content of the Newsletter
     */
    private String content;
    
    
    /**
     * Public method to set the content of the newsletter.
     * @param content Content to be saved.
     */
    public void set(String content)
    {
        this.content = content;
    }
    
    /**
     * Public method returning the content of the newsletter for display.
     * @return Content of Newsletter as String.
     */
    public String display()
    {
        // for readNewsletter to be displayed in GUI
        return this.content;
    }
}
