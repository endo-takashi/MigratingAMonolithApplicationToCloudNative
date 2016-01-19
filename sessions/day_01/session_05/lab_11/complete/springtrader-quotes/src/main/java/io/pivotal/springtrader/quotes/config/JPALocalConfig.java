package io.pivotal.springtrader.quotes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by cq on 18/1/16.
 */
@Configuration
@Profile("local-jpa")
@EnableJpaRepositories(basePackages = "io.pivotal.springtrader.quotes.repositories.jpa")
public class JPALocalConfig  {


}
