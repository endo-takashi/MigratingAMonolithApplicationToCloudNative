package io.springbox.authserver;

import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
@RestController
//This bootstraps the auth server by creating spring filters to handle the token credentials that are passed over requests
@EnableResourceServer
public class SpringboxAuthServerApplication extends WebMvcConfigurerAdapter {

    // A user endpoint to return the current authenticated user
    @RequestMapping("/user")
    public Object user(Principal user) {
        OAuth2Authentication authentication = (OAuth2Authentication) user;
        Authentication userAuthentication = authentication.getUserAuthentication();
        return userAuthentication.getPrincipal();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringboxAuthServerApplication.class, args);
    }

    @Configuration
    //Bootstraps an authentication server that handles the oauth 2 flow, by setting proper endpoints and setting some default spring security beans
    @EnableAuthorizationServer
    protected static class OAuth2Config extends AuthorizationServerConfigurerAdapter {

        @Autowired
        private AuthenticationManager authenticationManager;

        // We set the authentication manager configured on (vii) to be used by all endpoints
        @Override
        public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
            endpoints.authenticationManager(authenticationManager);
        }



        @Override
        public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
            clients.inMemory()
                    .withClient("acme")
                    .secret("acmesecret")
                    .authorizedGrantTypes("authorization_code", "refresh_token",
                            "password").scopes("openid");
        }

    }

    @Configuration
    protected static class AuthenticationManagerConfiguration extends GlobalAuthenticationConfigurerAdapter {

        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {

            auth.inMemoryAuthentication()
                    .withUser("mstine").password("secret").roles("USER", "ADMIN").and()
                    .withUser("littleidea").password("secret").roles("USER", "ADMIN").and()
                    .withUser("starbuxman").password("secret").roles("USER", "ADMIN");
        }

    }}