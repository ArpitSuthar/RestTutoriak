package com.arpit.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by arpit on 07-04-2016.
 */

@Service
public class PropertyService {

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Value("${key}")
    private String value;
}
