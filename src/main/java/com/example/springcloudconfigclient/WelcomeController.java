package com.example.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
	
	@Value("${app.name}")
	private String appName;
	
	@Value("${app.welcome}")
	private String appWelcomeMessage;
	
	@Value("${db.connection.string}")
	private String dbConnectionUrl;
	
	@Value("${db.connection.username}")
	private String dbConnectionUser;
	
	@Value("${db.connection.password}")
	private String dbConnectionPassword;
	
	@GetMapping("/user")
	public String welcomeUser() {
		return appWelcomeMessage + " to " + appName;
	}
	
	@GetMapping("/db")
	public String checkDB() {
		return dbConnectionUrl + " | " + dbConnectionUser + " | " + dbConnectionPassword ;
	}

}
