package dk.isten.andro.baseserver

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.locations.*
import com.fasterxml.jackson.databind.*
import io.ktor.jackson.*
import io.ktor.features.*
import io.ktor.client.*
import io.ktor.client.engine.jetty.*

fun main(args: Array<String>) {


    @Suppress("unused") // Referenced in application.conf
    fun Application.module(testing: Boolean = false) {
//    install(Locations) {
//    }

        install(CallLogging)

//    install(ContentNegotiation) {
//        jackson {
//            enable(SerializationFeature.INDENT_OUTPUT)
//        }
//    }

//    val client = HttpClient(Jetty) {
//    }

        routing {
            get("/") {
                call.respondText("Mjello mjuhl!", contentType = ContentType.Text.Plain)
            }

//        get<MyLocation> {
//            call.respondText("Location: name=${it.name}, arg1=${it.arg1}, arg2=${it.arg2}")
//        }
//        // Register nested routes
//        get<Type.Edit> {
//            call.respondText("Inside $it")
//        }
//        get<Type.List> {
//            call.respondText("Inside $it")
//        }
//
//        get("/json/jackson") {
//            call.respond(mapOf("hello" to "world"))
//        }
        }
    }
}

//@Location("/location/{name}")
//class MyLocation(val name: String, val arg1: Int = 42, val arg2: String = "default")
//
//@Location("/type/{name}") data class Type(val name: String) {
//    @Location("/edit")
//    data class Edit(val type: Type)
//
//    @Location("/list/{page}")
//    data class List(val type: Type, val page: Int)
//}

