package picturemouse;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Account.java
//  @ Date : 24/02/2014
//  @ Author : Jake Carr
//
//

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Class for the Account associated with every customer and administrator. This account
 * needs to be uniquely identifiable and contain useful and relevant fields.
 * @author jakecarr
 */
public class Account implements Serializable
{
    private String username;
    private String password;
    private Boolean isAdmin;
    private ArrayList<CinemaTicket> ticketsPurchased;
    private String firstName;
    private boolean SignedOn;
    private long creditCardNo;

    public Account(String username, String password, Boolean isAdmin, ArrayList<CinemaTicket> ticketsPurchased, String firstName, long creditCardNo) 
    {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.ticketsPurchased = ticketsPurchased;
        this.firstName = firstName;
        this.SignedOn = false;
        this.creditCardNo = creditCardNo;
    }

    /**
     * Method to modify the Account object. Allows you to change any 
     * attribute. If you want to keep an attribute the same then you will
     * have to enter the current attribute value.
     * 
     * @param username New username
     * @param password New password
     * @param isAdmin New administration setting
     * @param ticketsPurchased New ArrayList of tickets purchased
     * @param firstName New first name
     * @param creditCardNo New credit card number
     */
    public void modify(String username, String password, Boolean isAdmin, ArrayList<CinemaTicket> ticketsPurchased, String firstName, long creditCardNo)
    {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.ticketsPurchased = ticketsPurchased;
        this.firstName = firstName;
        this.creditCardNo = creditCardNo;
    }

    /**
     * Method to return the unique username of the account.
     * @return username of Account
     */
    public String getUsername() {
        return username;
    }

    /**
     * Method to return the password.
     * @return password of Account
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Method to return administration setting.
     * @return administration setting
     */
    public boolean getAdminSetting() {
        return isAdmin;
    }
    
    /**
     * Method to return tickets purchased.
     * @return ArrayList of tickets purchased
     */
    public ArrayList<CinemaTicket> getTicketsPurchased() {
        return ticketsPurchased;
    }
    
    /**
     * Method to return first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Method to return credit card number
     * @return credit card number
     */
    public long getCreditCardNo() {
        return creditCardNo;
    }

    /**
     * Method to add a new ticket to the Account's ticket purchased list.
     * @param ticket CinemaTicket to be add to the tickets purchased
     */
    public void addTicket(CinemaTicket ticket) {
        ticketsPurchased.add(ticket);
    }

    /**
     * Method to signal that the account has signed on.
     */
    public void signOn(){
        SignedOn = true;
    }

    /**
     * Method to signal that the account has signed off.
     */
    public void signOff(){
        SignedOn = false;
    }
    
    /**
     * Method to check whether the account is signed in
     * @return
     */
    public boolean checkSignedOn(){
        return SignedOn;
    }
    
}
