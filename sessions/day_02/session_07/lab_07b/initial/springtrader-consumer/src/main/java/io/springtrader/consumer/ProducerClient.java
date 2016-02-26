/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springtrader.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author 195015
 */
@FeignClient("producer")
public interface ProducerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    ProducerResponse getValue();
}
