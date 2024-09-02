package visitoron.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VisitorOnApplication

fun main(args: Array<String>) {
    runApplication<VisitorOnApplication>(*args)
}
