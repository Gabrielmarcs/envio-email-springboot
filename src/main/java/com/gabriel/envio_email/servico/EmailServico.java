package com.gabriel.envio_email.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Service;

@Service
public class EmailServico {
    @Autowired
    private JavaMailSender javaMailSender;
    
    public void enviar(String para, String assunto, String mensagem){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(para);
        simpleMailMessage.setSubject(assunto);
        simpleMailMessage.setText(mensagem);
        simpleMailMessage.setFrom("gabrielmarcoslopes761@gmail.com");

        javaMailSender.send(simpleMailMessage);
    }
}
