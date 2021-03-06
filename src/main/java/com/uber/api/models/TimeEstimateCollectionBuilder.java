/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.uber.api.models;

import java.util.*;

public class TimeEstimateCollectionBuilder {
    //the instance to build
    private TimeEstimateCollection timeEstimateCollection;

    /**
     * Default constructor to initialize the instance
     */
    public TimeEstimateCollectionBuilder() {
        timeEstimateCollection = new TimeEstimateCollection();
    }

    /**
     * List of time estimates
     */
    public TimeEstimateCollectionBuilder times(List<TimeEstimate> times) {
        timeEstimateCollection.setTimes(times);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TimeEstimateCollection build() {
        return timeEstimateCollection;
    }
}