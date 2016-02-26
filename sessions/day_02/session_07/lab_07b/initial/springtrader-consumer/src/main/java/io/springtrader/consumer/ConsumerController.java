package io.springtrader.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

//    @Autowired
//    RestTemplate restTemplate;
//
//    @RequestMapping(value = "/", produces = "application/json")
//    String consume() {
//        ProducerResponse response = restTemplate.getForObject("http://producer", ProducerResponse.class);
//        return String.format("{\"value\":%d}", response.getValue());
//    }
    
    @Autowired
    ProducerClient client;
    
    @RequestMapping(value = "/", produces = "application/json")
        String consume() {
            ProducerResponse response = client.getValue();
            return String.format("{\"value\":%d}", response.getValue());
        }    

}
