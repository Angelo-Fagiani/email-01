package it.develhope.email01.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendTo(String email,String title,String text){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setFrom("angelo.develhope@gmail.com");
        message.setSubject(title);
        message.setText(text);
        mailSender.send(message);
    }

}
