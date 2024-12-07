package br.com.cotiinformatica.infrastructure.configurations;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration {
	
	//pegando o nome da fila mapeada 
	//na variavel do apllication.properties
	
	@Value("${queue.name}")
	private String queueName;
	
	/*
	 * Método para definir o nome da fila que iremos 
	 * acessar o servidor de mensageria
	 */
	@Bean
	Queue queie() {
		//definir o nome da fila
		//true -- definir a fila como duravel ou seja não será apada mesmo se o servidor seja parado
		return new Queue(queueName,true);
	}
}
