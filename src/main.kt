import org.w3c.dom.HTMLDivElement
import kotlin.browser.document
import kotlin.browser.window
import kotlin.js.json

fun main(args: Array<String>) {

    val div = document.getElementById("my_div") as HTMLDivElement

    val jsonFileUrl = "https://www.lottiefiles.com/storage/datafiles/zc3XRzudyWE36ZBJr7PIkkqq0PFIrIBgp4ojqShI/newAnimation.json"

    val lottie = window.asDynamic().lottie

    val animData = json(
            Pair("container", div),
            Pair("renderer", "svg"),
            Pair("loop", true),
            Pair("autoplay", true),
            Pair("path", jsonFileUrl)
    )

    lottie.loadAnimation(animData)
}
