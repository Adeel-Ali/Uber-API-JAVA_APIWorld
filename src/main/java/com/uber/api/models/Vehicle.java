/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Vehicle 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5516947387600175365L;
    private String licensePlate;
    private String make;
    private String model;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("license_plate")
    public String getLicensePlate ( ) { 
        return this.licensePlate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("license_plate")
    public void setLicensePlate (String value) { 
        this.licensePlate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("make")
    public String getMake ( ) { 
        return this.make;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("make")
    public void setMake (String value) { 
        this.make = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("model")
    public String getModel ( ) { 
        return this.model;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("model")
    public void setModel (String value) { 
        this.model = value;
    }
 
}
 