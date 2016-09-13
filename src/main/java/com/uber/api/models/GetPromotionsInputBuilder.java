/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.uber.api.models;

import java.util.*;

public class GetPromotionsInputBuilder {
    //the instance to build
    private GetPromotionsInput getPromotionsInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetPromotionsInputBuilder() {
        getPromotionsInput = new GetPromotionsInput();
    }

    /**
     * Latitude component of end location.
     */
    public GetPromotionsInputBuilder endLatitude(double endLatitude) {
        getPromotionsInput.setEndLatitude(endLatitude);
        return this;
    }

    /**
     * Longitude component of end location.
     */
    public GetPromotionsInputBuilder endLongitude(double endLongitude) {
        getPromotionsInput.setEndLongitude(endLongitude);
        return this;
    }

    /**
     * Latitude component of start location.
     */
    public GetPromotionsInputBuilder startLatitude(double startLatitude) {
        getPromotionsInput.setStartLatitude(startLatitude);
        return this;
    }

    /**
     * Longitude component of start location
     */
    public GetPromotionsInputBuilder startLongitude(double startLongitude) {
        getPromotionsInput.setStartLongitude(startLongitude);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetPromotionsInput build() {
        return getPromotionsInput;
    }
}