package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication


@OpenAPIDefinition(info = @Info(title="Super Market Rest API",version="1.0",description="This API provides functionality for managing Customers, Administrators (admins), Items, Bills, and Orders. It allows customers to register, view items, and make purchases. Admins can perform CRUD operations on various entities and place orders based on item stock."))
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

//	@Bean
//	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
//	{
//		return http.authorizeHttpRequests(auth->{
//			auth.requestMatchers("/casual").permitAll();
		//	auth.requestMatchers("/items").permitAll();
		//	auth.requestMatchers("/addPurchase").permitAll();
		//	auth.requestMatchers("/items/{itemId}").permitAll();
		//	auth.requestMatchers("/registerCustomer").permitAll();
		//	auth.requestMatchers("/customers/{customerId}").permitAll();
//			
//			
//			
//			auth.requestMatchers("/secured").authenticated();
			//auth.requestMatchers("/admin/**").authenticated();  //All Admin endpoints have Oauth
//			
//			
//		})
//		.oauth2Login(Customizer.withDefaults())
//		.formLogin(Customizer.withDefaults()).
//		build();
//	}
}
