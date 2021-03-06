/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetUserActivityV11Input 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5225892828759752665L;
    private int limit;
    private int offset;
    /** GETTER
     * Number of items to return for pagging
     */
    @JsonGetter("limit")
    public int getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * Number of items to return for pagging
     */
    @JsonSetter("limit")
    public void setLimit (int value) { 
        this.limit = value;
    }
 
    /** GETTER
     * Page offset for pagging
     */
    @JsonGetter("offset")
    public int getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * Page offset for pagging
     */
    @JsonSetter("offset")
    public void setOffset (int value) { 
        this.offset = value;
    }
 
}
 