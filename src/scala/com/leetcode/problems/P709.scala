package scala.com.leetcode.problems

object Solution709 {
    def toLowerCase(str: String): String = {
        str.map(c => {
            if (c.toInt > 64 && c.toInt < 91) (c.toInt + 32).toChar else c
        })
    }
}

object P709 {
    def main(args: Array[String]): Unit = {
        println(Solution709.toLowerCase("Hello"))
        println(Solution709.toLowerCase("here"))
        println(Solution709.toLowerCase("LOVELY"))
    }
}
