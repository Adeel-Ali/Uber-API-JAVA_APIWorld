/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.uber.api;

import com.uber.api.controllers.*;
import com.uber.api.http.client.HttpClient;

public class UberAPIClient {
    /**
     * Singleton access to Client controller
     * @return	Returns the APIController instance 
     */
    public APIController getClient() {
        return APIController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public UberAPIClient() {	
	}

    /**
     * Client initialization constructor 
     */     
    public UberAPIClient(String oAuthAccessToken) {
        this();
        Configuration.oAuthAccessToken = oAuthAccessToken;
    }
}