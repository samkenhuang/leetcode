/**
  * @address https://leetcode.com/problems/sort-array-by-parity/description/
  */
package scala.com.leetcode.problems

object Solution905 {
    def sortArrayByParity(A: Array[Int]): Array[Int] = {
        return A.sortWith((left, right) => right % 2 > left % 2)
    }
}

object P905 {
    def main(args: Array[String]): Unit = {
        println(Solution905.sortArrayByParity(Array(3,1,2,4)))
    }
}
