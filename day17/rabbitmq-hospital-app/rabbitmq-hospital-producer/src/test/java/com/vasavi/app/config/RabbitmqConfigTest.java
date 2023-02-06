package com.vasavi.app.config;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.MessageConverter;

public class RabbitmqConfigTest {

    @InjectMocks
    RabbitmqConfig rabbitMQConfig;

    @Test
    public void rabbitTemplateTest() {
        ConnectionFactory connectionFactory= Mockito.mock(ConnectionFactory.class);
        MessageConverter messageConverter= Mockito.mock(MessageConverter.class);
        AmqpTemplate rabbitTemplate=rabbitMQConfig.rabbitTemplate(connectionFactory);
    }
}
