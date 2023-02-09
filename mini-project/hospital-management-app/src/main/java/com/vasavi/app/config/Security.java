package com.vasavi.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class Security extends WebSecurityConfigurerAdapter {

    private static final String[] AUTH_LIST={
            "/swagger-ui/**",
            "/swagger-resources/**"
    };
    @Override
    public void configure(HttpSecurity http)throws Exception{
        http.httpBasic().and().authorizeRequests()
                .antMatchers(AUTH_LIST).hasAnyRole("DOCTOR","PATIENT")
                .antMatchers(HttpMethod.GET,"/doctor/doctor-appointment").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.GET,"/patient/my-appointment").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.POST,"/doctor/save").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.POST,"/patient/save").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.GET,"/prescription/view-prescription").hasAnyRole("DOCTOR","PATIENT")
                .antMatchers(HttpMethod.POST,"/prescription/save-prescription").hasAnyRole("DOCTOR","PATIENT")
                .and().csrf().disable().headers().frameOptions().disable();
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
        auth.inMemoryAuthentication().withUser("Doctor").password("{noop}doctor").roles("DOCTOR").and()
                .withUser("Patient").password("{noop}patient").roles("PATIENT");
    }


}
