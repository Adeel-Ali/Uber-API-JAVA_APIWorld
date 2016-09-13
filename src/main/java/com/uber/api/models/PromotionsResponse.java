/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PromotionsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5283177492882687207L;
    private String displayText;
    private String localizedValue;
    private String type;
    /** GETTER
     * A localized string we recommend to use when offering the promotion to users.
     */
    @JsonGetter("display_text")
    public String getDisplayText ( ) { 
        return this.displayText;
    }
    
    /** SETTER
     * A localized string we recommend to use when offering the promotion to users.
     */
    @JsonSetter("display_text")
    public void setDisplayText (String value) { 
        this.displayText = value;
    }
 
    /** GETTER
     * The value of the promotion that is available to a user in this location in the local currency.
     */
    @JsonGetter("localized_value")
    public String getLocalizedValue ( ) { 
        return this.localizedValue;
    }
    
    /** SETTER
     * The value of the promotion that is available to a user in this location in the local currency.
     */
    @JsonSetter("localized_value")
    public void setLocalizedValue (String value) { 
        this.localizedValue = value;
    }
 
    /** GETTER
     * The type of the promo which is either "trip_credit" or "account_credit".
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The type of the promo which is either "trip_credit" or "account_credit".
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
 