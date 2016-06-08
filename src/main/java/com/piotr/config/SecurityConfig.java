package com.piotr.config;

import com.piotr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by jalos on 06.05.2016.
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserService userService;

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // csrf - cross site request forgery
        http
                .csrf().disable()

                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/register").permitAll()
                .antMatchers("/**").authenticated()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .and()

                .formLogin()
                    .permitAll()
                    .loginProcessingUrl("/exams")
                .and()

                .logout()
                    .permitAll()
                    .logoutUrl("/logout");

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // autentykacja w pamieci
        //auth.inMemoryAuthentication().withUser("admin").password("1234").roles("ADMIN");

        // autentykacja w bazie danych
        auth.userDetailsService(userService);
    }
}
