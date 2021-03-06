/*
 * Echo API
 * Simple Rest Echo
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pakcage.example.rest_client.api;

import com.pakcage.example.rest_client.ApiException;
import com.pakcage.example.rest_client.model.EchoResponse;
import com.pakcage.example.rest_client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EchoApi
 */
@Ignore
public class EchoApiTest {

    private final EchoApi api = new EchoApi();

    
    /**
     * 
     *
     * Returns the &#39;message&#39; to the caller
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void echoTest() throws ApiException {
        String message = "test echo service";
        EchoResponse response = api.echo(message);
        System.out.println(response.toString());
        // TODO: test validations
    }
    
}
