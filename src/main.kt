import org.w3c.dom.HTMLDivElement
import kotlin.browser.document
import kotlin.js.Json
import kotlin.js.json

fun main(args: Array<String>) {

    val div = document.getElementById("my_div") as HTMLDivElement

    val jsonFileUrl = "https://www.lottiefiles.com/storage/datafiles/zc3XRzudyWE36ZBJr7PIkkqq0PFIrIBgp4ojqShI/newAnimation.json"

    val animData = json(
            Pair("container", div),
            Pair("renderer", "svg"),
            Pair("loop", true),
            Pair("autoplay", true),
            Pair("path", jsonFileUrl)
    )

    lottie.loadAnimation(animData)
}

external val lottie: Lottie

abstract external class Lottie {
    fun loadAnimation(animData: Json)
}