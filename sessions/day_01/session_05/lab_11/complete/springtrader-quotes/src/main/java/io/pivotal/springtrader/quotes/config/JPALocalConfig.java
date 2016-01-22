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

//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource driver = new DriverManagerDataSource();
//        driver.setDriverClassName("org.postgresql.Driver");
//        driver.setUrl("jdbc:postgresql://localhost:5432/cq");
//        driver.setUsername("cq");
//        return driver;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setDatabase(Database.POSTGRESQL);
//        vendorAdapter.setGenerateDdl(true);
//        vendorAdapter.setShowSql(true);
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(vendorAdapter);
//        factory.setDataSource(dataSource());
//        factory.setPackagesToScan("io.pivotal.springtrader.quotes.domain.jpa");
//
//        return factory;
//    }
//
//    @Bean
//    @Autowired
//    public JpaTransactionManager transactionManager() {
//        JpaTransactionManager txManager = new JpaTransactionManager();
//        txManager.setEntityManagerFactory(entityManagerFactory().getObject());
//
//        return txManager;
//    }

}
