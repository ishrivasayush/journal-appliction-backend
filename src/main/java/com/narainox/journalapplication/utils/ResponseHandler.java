package com.narainox.journalapplication.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (message!=null) {
            map.put("message", message);
        }
        map.put("status", status.value());
        if (responseObj!=null) {
            map.put("data", responseObj);
        }
        return new ResponseEntity<Object>(map, status);
    }
}