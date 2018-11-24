/**
  * @address https://leetcode.com/problems/flipping-an-image/description/
  */
package scala.com.leetcode.problems

object Solution832 {
    def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] = {
        return A.map(b => {
            val res = new Array[Int](b.length)
            for (i <- 0 until b.length) {
                res(i) = if (b(b.length - 1 - i) == 1) 0 else 1
            }
            res
        })
    }
}

object P832 {
    def main(args: Array[String]): Unit = {
        assert(Solution832.flipAndInvertImage(Array(Array(1,1,0),Array(1,0,1),Array(0,0,0))).canEqual(Array(Array(1,0,0), Array(0,1,0), Array(1,1,1))))
    }
}
