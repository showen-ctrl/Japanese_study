package org.innox.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class CustomWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.addFilterAfter(new CORSFilter(), BasicAuthenticationFilter.class).cors().and().csrf().disable()
				.authorizeRequests().antMatchers("/**", "/*").permitAll().anyRequest().permitAll();
	}
}
