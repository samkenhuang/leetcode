package scala.com.leetcode.problems

object Solution977 {
    def sortedSquares(A: Array[Int]): Array[Int] = {
        A.map(i => i * i).sortWith((left, right) => left < right)
    }
}

object P977 {
    def main(args: Array[String]): Unit = {
        println(Solution977.sortedSquares(Array(1,2,3)).mkString(","))
        println(Solution977.sortedSquares(Array(-4,-1,0,3,10)).mkString(","))
    }
}