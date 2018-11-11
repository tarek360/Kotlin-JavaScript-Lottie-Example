import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement
import kotlin.browser.document

fun main(args: Array<String>) {

    val div = document.getElementById("my_div") as HTMLDivElement

    val jsonFileUrl = "https://www.lottiefiles.com/storage/datafiles/zc3XRzudyWE36ZBJr7PIkkqq0PFIrIBgp4ojqShI/newAnimation.json"

    val animData = AnimData(div, "svg", true, true, jsonFileUrl)

    lottie.loadAnimation(animData)
}

data class AnimData(val container: HTMLElement,
                    val renderer: String,
                    val loop: Boolean,
                    val autoplay: Boolean,
                    val path: String)

external val lottie: Lottie

abstract external class Lottie {
    fun loadAnimation(animData: AnimData)
}