/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.uber.api.models;

import java.util.*;

public class RequestMapResponseBuilder {
    //the instance to build
    private RequestMapResponse requestMapResponse;

    /**
     * Default constructor to initialize the instance
     */
    public RequestMapResponseBuilder() {
        requestMapResponse = new RequestMapResponse();
    }

    public RequestMapResponseBuilder href(String href) {
        requestMapResponse.setHref(href);
        return this;
    }

    public RequestMapResponseBuilder requestId(String requestId) {
        requestMapResponse.setRequestId(requestId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RequestMapResponse build() {
        return requestMapResponse;
    }
}