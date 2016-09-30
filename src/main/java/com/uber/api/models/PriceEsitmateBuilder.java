/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.uber.api.models;

import java.util.*;

public class PriceEsitmateBuilder {
    //the instance to build
    private PriceEsitmate priceEsitmate;

    /**
     * Default constructor to initialize the instance
     */
    public PriceEsitmateBuilder() {
        priceEsitmate = new PriceEsitmate();
    }

    /**
     * ISO 4217 currency code.
     */
    public PriceEsitmateBuilder currencyCode(String currencyCode) {
        priceEsitmate.setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * Display name of product.
     */
    public PriceEsitmateBuilder displayName(String displayName) {
        priceEsitmate.setDisplayName(displayName);
        return this;
    }

    /**
     * Expected activity distance (in miles).
     */
    public PriceEsitmateBuilder distance(double distance) {
        priceEsitmate.setDistance(distance);
        return this;
    }

    /**
     * Expected activity duration (in seconds). Always show duration in minutes.
     */
    public PriceEsitmateBuilder duration(int duration) {
        priceEsitmate.setDuration(duration);
        return this;
    }

    /**
     * Formatted string of estimate in local currency of the start location. Estimate could be a range, a single number (flat rate) or "Metered" for TAXI.
     */
    public PriceEsitmateBuilder estimate(String estimate) {
        priceEsitmate.setEstimate(estimate);
        return this;
    }

    /**
     * Upper bound of the estimated price.
     */
    public PriceEsitmateBuilder highEstimate(int highEstimate) {
        priceEsitmate.setHighEstimate(highEstimate);
        return this;
    }

    /**
     * Lower bound of the estimated price.
     */
    public PriceEsitmateBuilder lowEstimate(int lowEstimate) {
        priceEsitmate.setLowEstimate(lowEstimate);
        return this;
    }

    /**
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     */
    public PriceEsitmateBuilder productId(String productId) {
        priceEsitmate.setProductId(productId);
        return this;
    }

    /**
     * Expected surge multiplier. Surge is active if surge_multiplier is greater than 1. Price estimate already factors in the surge multiplier.
     */
    public PriceEsitmateBuilder surgeMultiplier(double surgeMultiplier) {
        priceEsitmate.setSurgeMultiplier(surgeMultiplier);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PriceEsitmate build() {
        return priceEsitmate;
    }
}