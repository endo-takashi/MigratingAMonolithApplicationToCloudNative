/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springtrader.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 195015
 */
@RestController
public class GreetingController {
    
    private @Value("${greeting}")
            String greeting;
    
    @RequestMapping("/")
    public String greeter() {
        return greeting + " World!";
    }
}
