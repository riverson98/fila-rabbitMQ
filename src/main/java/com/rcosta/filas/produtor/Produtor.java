package com.rcosta.filas.produtor;

import com.rcosta.filas.servico.ServicoRabbitMQ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/mensagens")
public class Produtor {

    @Autowired
    private ServicoRabbitMQ servicoRabbitMQ;

    @PostMapping
    public void enviaMensagem(@RequestBody String mensagem){
        log.info("================ Enviando mensagem: " + mensagem + " ================");
        servicoRabbitMQ.enviaMenssagem(mensagem);
    }
}
