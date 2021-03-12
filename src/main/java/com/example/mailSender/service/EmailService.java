package com.example.mailSender.service;

import com.example.mailSender.conf.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {


    private BeanConfig beanConfig;
    private JavaMailSender javaMailSender;

    public EmailService(BeanConfig beanConfig, JavaMailSender javaMailSender) {
        this.beanConfig = beanConfig;
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail() {

        javaMailSender = beanConfig.getJavaMailSenderInstance("Phwellk350");

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("kossy77@gmail.com");
        msg.setFrom("p.kossakowski@o2.pl");
        msg.setSubject("Przypomnienie o mailu do pracy");
        msg.setText("Mail \n Wysłac maila");

        javaMailSender.send(msg);

    }

    public void test() {
        System.out.println("test");
    }


}
