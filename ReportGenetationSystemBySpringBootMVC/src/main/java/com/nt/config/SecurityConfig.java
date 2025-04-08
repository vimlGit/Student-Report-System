
  package com.nt.config;
  
  import org.springframework.context.annotation.Bean;
import
  org.springframework.context.annotation.Configuration;
import
  org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
  
  @Configuration
  @EnableWebSecurity
  public class SecurityConfig {
	  
	  @Bean
	  public PasswordEncoder passwordEncoder() {
		  return new BCryptPasswordEncoder();
	  }
	  
	  @Bean
	   public InMemoryUserDetailsManager userDetailsService() {
		   UserDetails user1=User	.withUsername("vimlesh")
				   					.password(passwordEncoder().encode("password"))
				   					.roles("STAFF")
		                            .build();
		   
		   UserDetails user2=User.withUsername("student")
  					.password(passwordEncoder().encode("password"))
  					.roles("USER")
                   .build();
		   UserDetails admin=User.withUsername("admin")
 					.password(passwordEncoder().encode("password"))
 					.roles("ADMIN")
                  .build();
		   
		   return new InMemoryUserDetailsManager(user1,user2,admin);
	   }
	  
  
  @Bean 
  public SecurityFilterChain filterChain(HttpSecurity httpSecurity )  throws Exception { 
	  System.out.println( "SecurityConfig.filterChain()========================================================================="  ); 
  httpSecurity.csrf()
  .disable() 
  .authorizeRequests()
  
  .requestMatchers("/edit","/delete")
  .hasRole("ADMIN")
  
  .requestMatchers("/register")
  .hasAnyRole("STAFF","ADMIN")
  
  .requestMatchers("/result","/report")
  .hasAnyRole("USER","ADMIN","STAFF")  
  
  .requestMatchers("/**")
  .permitAll() 
  
  .anyRequest() 
  .authenticated()
  .and() 
  .formLogin()
  .and().logout()
  .and().exceptionHandling().accessDeniedPage("/denied");
  return httpSecurity.build();
  } }
 