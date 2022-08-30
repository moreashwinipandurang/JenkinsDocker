package com.example.Jenkins;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JenkinsApplication {
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsApplication.class);
	
	public void intt()
	{
		logger.info("Application started...");
	}

	public static void main(String[] args)
	{
		logger.info("Application executed");
		logger.info("executed");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
