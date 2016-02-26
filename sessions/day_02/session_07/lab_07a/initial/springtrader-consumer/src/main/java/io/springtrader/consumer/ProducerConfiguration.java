/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springtrader.consumer;

import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author 195015
 */
@Configuration
public class ProducerConfiguration {

    @Bean
    public IClientConfig ribbonClientConfig() {
        DefaultClientConfigImpl config = new DefaultClientConfigImpl();
        config.loadProperties("producer");
        return config;
    }

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        WeightedResponseTimeRule rule = new WeightedResponseTimeRule();
        rule.initWithNiwsConfig(config);
        return rule;
    }
}