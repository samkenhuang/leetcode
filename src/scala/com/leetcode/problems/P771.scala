/**
  * @address https://leetcode.com/problems/jewels-and-stones/description/
  */
object Solution771 {
    def numJewelsInStones(J: String, S: String): Int = {
        var res = 0
        S.map(c => {
            if (J.contains(c)) res += 1
        })
        return res
    }
}

object P771 {
    def main(args: Array[String]): Unit = {
        println(Solution771.numJewelsInStones("aA", "aAAbbbb"))
        println(Solution771.numJewelsInStones("z", "ZZ"))
    }
}


