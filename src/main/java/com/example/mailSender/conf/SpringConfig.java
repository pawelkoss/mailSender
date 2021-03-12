package com.example.mailSender.conf;

import com.example.mailSender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSendException;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;

@Configuration
@EnableScheduling
public class SpringConfig {

    @Autowired
    private EmailService emailService;

    private void task() {
        System.out.println("sending mail ... " + LocalTime.now());
        try {
            emailService.sendEmail();
        } catch (MailSendException e) {
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "${cron.string.pawel.g19}")
    public void cronSchedulePawel9() {
        task();
    }

    @Scheduled(cron = "${cron.string.pawel.test}")
    public void cronSchedulePawel07() {
        task();
    }


}
