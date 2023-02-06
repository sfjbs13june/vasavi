package test.java.com.vasavi.app.component;

import com.vasavi.app.model.Hospital;
import com.vasavi.app.model.Patient;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqConsumerTest {

    @Value("${app.queue.name}")
    String queueName;

    @Value("${app.exchange.name}")
    String exchange;

    @Value("${app.routingkey.name}")
    private String routingkey;

    @Bean
    public Jackson2JsonMessageConverter Converter() {
        return new Jackson2JsonMessageConverter();
    }

    @RabbitListener(queues = "${app.queue.name}")
    public void receivedMessage(Hospital hospital) {
        System.out.println("Received Message From RabbitMQ: " + hospital);
    }

    @RabbitListener(queues = "${app.queue.name}")
    public void receivedMessageP(Patient patient)
    {
        System.out.println("Received Message From RabbitMQ: ");
    }
}
