package com.example.mailSender.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class BeanConfig {


    public JavaMailSender getJavaMailSenderInstance(String pwd) {
        JavaMailSenderImpl javaMailSenderObject = new JavaMailSenderImpl();


        javaMailSenderObject.setUsername("p.kossakowski@o2.pl");
        javaMailSenderObject.setPassword(pwd);
        javaMailSenderObject.setPort(465);
        javaMailSenderObject.setHost("poczta.o2.pl");

        Properties props = javaMailSenderObject.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.connectiontimeout", 5000);
        props.put("mail.smtp.timeout", 5000);
        props.put("mail.smtp.writetimeout", 5000);


        return javaMailSenderObject;
    }
}
