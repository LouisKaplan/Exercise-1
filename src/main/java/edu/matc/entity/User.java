package edu.matc.entity;

import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * A class to represent a user.
 *
 * @author pwaite
 */
public class User {
    private String firstName;
    private String lastName;
    private String userid;
    private String dateOfBirth;

    public long calculateDate() throws Exception{
        long diffYears = 0;
        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            Date dobAsDate = df.parse(dateOfBirth);
            Date currentDate = new Date();

            long diff = currentDate.getTime() - dobAsDate.getTime();
            diffYears = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) / 365;
        } catch(Exception e){System.out.println("User.calculateDate(): " + e);}

        return diffYears;
    }

    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userid    the userid
     * @param dateOfBirth the date of birth
     */
    public User(String firstName, String lastName, String userid, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userid = userid;
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * Gets dateOfBirth.
     *
     * @return the date of birth
     */
    public String getDateOfBirth() {return dateOfBirth;}

    /**
     * Sets dateOfBirth.
     *
     * @param dateOfBirth the date of birth
     */
    public void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userid='" + userid + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }


}