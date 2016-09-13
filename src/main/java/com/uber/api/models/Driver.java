/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Driver 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4721747099496344780L;
    private String name;
    private String phoneNumber;
    private String pictureUrl;
    private double rating;
    /** GETTER
     * The first name of the driver.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The first name of the driver.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The formatted phone number for contacting the driver.
     */
    @JsonGetter("phone_number")
    public String getPhoneNumber ( ) { 
        return this.phoneNumber;
    }
    
    /** SETTER
     * The formatted phone number for contacting the driver.
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber (String value) { 
        this.phoneNumber = value;
    }
 
    /** GETTER
     * The URL to the photo of the driver.
     */
    @JsonGetter("picture_url")
    public String getPictureUrl ( ) { 
        return this.pictureUrl;
    }
    
    /** SETTER
     * The URL to the photo of the driver.
     */
    @JsonSetter("picture_url")
    public void setPictureUrl (String value) { 
        this.pictureUrl = value;
    }
 
    /** GETTER
     * The driver's star rating out of 5 stars.
     */
    @JsonGetter("rating")
    public double getRating ( ) { 
        return this.rating;
    }
    
    /** SETTER
     * The driver's star rating out of 5 stars.
     */
    @JsonSetter("rating")
    public void setRating (double value) { 
        this.rating = value;
    }
 
}
 