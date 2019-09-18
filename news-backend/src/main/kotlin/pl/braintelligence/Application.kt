package pl.braintelligence

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Profile
import kotlin.reflect.full.companionObject

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}

fun <R : Any> R.logger(): Lazy<Logger> = lazy {
    LoggerFactory.getLogger(unwrapCompanionClass(this.javaClass).name)
}

fun <T : Any> unwrapCompanionClass(ofClass: Class<T>): Class<*> =
        if (ofClass.enclosingClass?.kotlin?.companionObject?.java == ofClass) {
            ofClass.enclosingClass
        } else {
            ofClass
        }
