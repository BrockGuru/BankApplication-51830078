package com.bankapp.model.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService detailservice;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(detailservice);
	}

	@Bean
	public BCryptPasswordEncoder getpasswordEncoder()
	{
		return new BCryptPasswordEncoder();
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
				.antMatchers("/admin/**").hasRole("ADMIN")
				.antMatchers("/mgr/**").hasRole("MGR")
				.antMatchers("/clerk/**").hasRole("CLERK").and().httpBasic();

	}

}
