package ua.com.vendigo.knutimetable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Launcher.class, args);
    }

    @Configuration
    @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.httpBasic().and().authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/faculties").authenticated()
                    .antMatchers(HttpMethod.PUT, "/faculties/**").authenticated()
                    .antMatchers(HttpMethod.PATCH, "/faculties/**").authenticated()
                    .antMatchers(HttpMethod.DELETE, "/faculties/**").authenticated()
                    .antMatchers(HttpMethod.POST, "/groups").authenticated()
                    .antMatchers(HttpMethod.PUT, "/groups/**").authenticated()
                    .antMatchers(HttpMethod.PATCH, "/groups/**").authenticated()
                    .antMatchers(HttpMethod.DELETE, "/groups/**").authenticated()
                    .antMatchers(HttpMethod.POST, "/pairs").authenticated()
                    .antMatchers(HttpMethod.PUT, "/pairs/**").authenticated()
                    .antMatchers(HttpMethod.PATCH, "/pairs/**").authenticated()
                    .antMatchers(HttpMethod.DELETE, "/pairs/**").authenticated()
                    .and()
                    .csrf().disable();
        }
    }

}
