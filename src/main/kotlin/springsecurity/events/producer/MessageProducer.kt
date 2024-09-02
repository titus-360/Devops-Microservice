package visitoron.app.events.producer

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

/**
 *
 * @author Titus Murithi Bundi
 */
@Component
class MessageProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {

    fun queueMessage(message: String) {
        kafkaTemplate.send("message", message)
    }

}
