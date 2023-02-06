package main.java.com.vasavi.app.component;

import main.java.com.vasavi.app.model.Hospital;
import main.java.com.vasavi.app.model.Patient;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqConsumer {
    @Value("${rabbitmq.exchange.name}");
    String exchange;

    @Value("${rabbitmq.routingKey.name}");
    private String routingKey;

    @Bean
    public Jackson2JsonMessageConverter converter(){
        return new Jackson2JsonMessageConverter();
    }

    @RabbitListner(queues = "${rabbitmq.queue.name}")
    public void receivedMessage(Hospital hospital){
        System.out.println("Received Message from Rabbitmq: "+hospital);
    }
    @RabbitListner(queues = "${rabbitmq.queue.name}")
    public void receivedMessage(Patient patient){
    System.out.println("Received Message from Rabbitmq: "+patient);
}


}
