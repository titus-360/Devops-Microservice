package visitoron.app.events.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

/**
 *
 * @author Titus Murithi Bundi
 */
@Component
class MessageConsumer {

    @KafkaListener(topics = ["message"], groupId = "my-group-id")
    fun consumeMessage(message: String) {
        println("Consumed message: $message")
    }
}

