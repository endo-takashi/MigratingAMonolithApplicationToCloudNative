/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springtrader.consumer;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author 195015
 */
@RestController
public class ConsumerController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/", produces = "application/json")
    String consume() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("PRODUCER", false);

        RestTemplate restTemplate = new RestTemplate();
        ProducerResponse response = restTemplate.getForObject(instance.getHomePageUrl(), ProducerResponse.class);

        return String.format("{\"value\":%d}", response.getValue());
    }

}