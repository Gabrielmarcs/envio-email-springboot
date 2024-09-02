package com.gabriel.envio_email.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gabriel.envio_email.servico.EmailServico;

@RestController
@RequestMapping("/email")
public class EmailControle {
    
    @Autowired
    private EmailServico emailServico;

    @PostMapping("/enviar")
    public String enviarEmail(@RequestParam String para, @RequestParam String assunto, @RequestParam String mensagem){
        emailServico.enviar(para, assunto, mensagem);
        return "Email enviado com sucesso!";
    }
}
