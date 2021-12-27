import java.io.FileInputStream
import java.util.*

data class Dataclas(val s1: String, val s2: String)

fun main() {

    val sc = Scanner(FileInputStream("input.txt"))
    var roles = mutableListOf<String>()
    var textLines = mutableListOf<Dataclas>()
    var flag = true

    while (sc.hasNextLine()) {
        var s = sc.nextLine()

        if (flag) {
            if (s.trim() == "textLines:") {
                flag = false
            } else {
                roles.add(s.trim())
            }
        }
        else {
            var s = s.trim().split(":")
            textLines.add(Dataclas(s[0], s[1]))
        }
    }

    for (i in roles){
        println(i + ":")
        for (j in 0..textLines.size-1){
            if(textLines[j].s1 == i){
                println((j+1).toString() + ") " + textLines[j].s2)
            }
        }
    }
}
