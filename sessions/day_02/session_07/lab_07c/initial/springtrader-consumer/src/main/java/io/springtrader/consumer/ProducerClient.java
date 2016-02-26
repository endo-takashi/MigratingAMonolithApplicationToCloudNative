/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springtrader.consumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author 195015
 */
@Component
public class ProducerClient {

    @Autowired
    @LoadBalanced
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getProducerFallback")
    public ProducerResponse getValue() {
        return restTemplate.getForObject("http://producer", ProducerResponse.class);
    }

    private ProducerResponse getProducerFallback() {
        return new ProducerResponse(42);
    }
}