/**
  * @address https://leetcode.com/problems/unique-morse-code-words/description/
  */
package scala.com.leetcode.problems

object Solution804 {
    def uniqueMorseRepresentations(words: Array[String]): Int = {
        val morseMap = Array(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
        val morseSet = scala.collection.mutable.Set[String]()
        words.map(str => {
            morseSet.add(str.map( c => morseMap.apply(c.charValue() - 97)).mkString(""))
        })
        return morseSet.size
    }
}


object P804 {
    def main(args: Array[String]): Unit = {
        System.out.println(Solution804.uniqueMorseRepresentations(Array("gin", "zen", "gig", "msg")))
    }
}
