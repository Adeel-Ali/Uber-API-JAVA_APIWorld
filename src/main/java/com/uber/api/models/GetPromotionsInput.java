/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetPromotionsInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5575787166980863665L;
    private double endLatitude;
    private double endLongitude;
    private double startLatitude;
    private double startLongitude;
    /** GETTER
     * Latitude component of end location.
     */
    @JsonGetter("end_latitude")
    public double getEndLatitude ( ) { 
        return this.endLatitude;
    }
    
    /** SETTER
     * Latitude component of end location.
     */
    @JsonSetter("end_latitude")
    public void setEndLatitude (double value) { 
        this.endLatitude = value;
    }
 
    /** GETTER
     * Longitude component of end location.
     */
    @JsonGetter("end_longitude")
    public double getEndLongitude ( ) { 
        return this.endLongitude;
    }
    
    /** SETTER
     * Longitude component of end location.
     */
    @JsonSetter("end_longitude")
    public void setEndLongitude (double value) { 
        this.endLongitude = value;
    }
 
    /** GETTER
     * Latitude component of start location.
     */
    @JsonGetter("start_latitude")
    public double getStartLatitude ( ) { 
        return this.startLatitude;
    }
    
    /** SETTER
     * Latitude component of start location.
     */
    @JsonSetter("start_latitude")
    public void setStartLatitude (double value) { 
        this.startLatitude = value;
    }
 
    /** GETTER
     * Longitude component of start location
     */
    @JsonGetter("start_longitude")
    public double getStartLongitude ( ) { 
        return this.startLongitude;
    }
    
    /** SETTER
     * Longitude component of start location
     */
    @JsonSetter("start_longitude")
    public void setStartLongitude (double value) { 
        this.startLongitude = value;
    }
 
}
 