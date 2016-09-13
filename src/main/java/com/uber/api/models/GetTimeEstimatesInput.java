/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetTimeEstimatesInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5709232473740060567L;
    private double startLatitude;
    private double startLongitude;
    private String customerUuid;
    private String productId;
    /** GETTER
     * Latitude component of the start location
     */
    @JsonGetter("start_latitude")
    public double getStartLatitude ( ) { 
        return this.startLatitude;
    }
    
    /** SETTER
     * Latitude component of the start location
     */
    @JsonSetter("start_latitude")
    public void setStartLatitude (double value) { 
        this.startLatitude = value;
    }
 
    /** GETTER
     * Longitude component of the start location
     */
    @JsonGetter("start_longitude")
    public double getStartLongitude ( ) { 
        return this.startLongitude;
    }
    
    /** SETTER
     * Longitude component of the start location
     */
    @JsonSetter("start_longitude")
    public void setStartLongitude (double value) { 
        this.startLongitude = value;
    }
 
    /** GETTER
     * The customer id interested in estimate
     */
    @JsonGetter("customer_uuid")
    public String getCustomerUuid ( ) { 
        return this.customerUuid;
    }
    
    /** SETTER
     * The customer id interested in estimate
     */
    @JsonSetter("customer_uuid")
    public void setCustomerUuid (String value) { 
        this.customerUuid = value;
    }
 
    /** GETTER
     * Id of the requested product
     */
    @JsonGetter("product_id")
    public String getProductId ( ) { 
        return this.productId;
    }
    
    /** SETTER
     * Id of the requested product
     */
    @JsonSetter("product_id")
    public void setProductId (String value) { 
        this.productId = value;
    }
 
}
 