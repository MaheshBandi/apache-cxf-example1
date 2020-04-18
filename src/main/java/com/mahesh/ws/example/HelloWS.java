package com.mahesh.ws.example;

import org.apache.cxf.feature.Features;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWS {
    @WebMethod
    public String hello(){
        return "Hello";
    }
}
