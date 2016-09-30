/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.uber.api.models;

import java.util.*;

public class DriverBuilder {
    //the instance to build
    private Driver driver;

    /**
     * Default constructor to initialize the instance
     */
    public DriverBuilder() {
        driver = new Driver();
    }

    /**
     * The first name of the driver.
     */
    public DriverBuilder name(String name) {
        driver.setName(name);
        return this;
    }

    /**
     * The formatted phone number for contacting the driver.
     */
    public DriverBuilder phoneNumber(String phoneNumber) {
        driver.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * The URL to the photo of the driver.
     */
    public DriverBuilder pictureUrl(String pictureUrl) {
        driver.setPictureUrl(pictureUrl);
        return this;
    }

    /**
     * The driver's star rating out of 5 stars.
     */
    public DriverBuilder rating(double rating) {
        driver.setRating(rating);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Driver build() {
        return driver;
    }
}