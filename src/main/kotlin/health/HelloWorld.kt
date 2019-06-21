package health

import io.javalin.Javalin
import io.javalin.http.BadRequestResponse

fun main() {
    val app = Javalin.create().start(8080)
    var health = true
    app.get("/") { ctx -> ctx.result("Hello World. Health is $health") }
    app.get("/health") { ctx ->
        if (health) ctx.result("OK")
        else throw BadRequestResponse()
        }
    app.get("/healthOn") { ctx ->
        health = true
        ctx.result("Health is $health")}
    app.get("/healthOff") { ctx ->
        health = false
        ctx.result("Health is $health")}
}