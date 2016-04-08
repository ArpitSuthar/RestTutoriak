package com.arpit.spring;

import com.arpit.spring.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by arpit on 07-04-2016.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    PropertyService propertyService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String getGreeting(@PathVariable String name){
        return propertyService.getValue();

    }
}
