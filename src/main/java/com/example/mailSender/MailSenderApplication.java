package com.example.mailSender;

import com.example.mailSender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailSenderApplication implements CommandLineRunner {

	@Autowired
	private EmailService emailService;


	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//CronTrigger cronTrigger = new CronTrigger("30 55 13 * * ?");


		System.out.println("Starting sending emails ...");

		emailService.test();

		//System.out.println("Done");




	}




}
