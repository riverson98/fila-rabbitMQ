package com.rcosta.filas.consumidor;

import com.rcosta.filas.configuracao.ConfiguracaoRabbitMQ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RabbitListener(queues = ConfiguracaoRabbitMQ.NOME_FILA)
public class Consumidor {

    @RabbitHandler
    public void consumirMensagem(String mensagem){

        log.info("==================== RECEBENDO MENSAGEM ====================");

        log.info("==================== " + mensagem + " ====================");

        log.info("====================  FIM RECEBENDO MENSAGEM ====================");
    }
}
