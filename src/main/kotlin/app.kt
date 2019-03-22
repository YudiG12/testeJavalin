import io.javalin.Javalin

fun main(args: Array<String>) {
    val app = Javalin.create().enableStaticFiles("/public").start(7000)

    app.routes {
        app.get("/") { ctx -> ctx.html("Helloooooooooo!<br>oiiii") }
        app.get("/feijao") { }
    }
}