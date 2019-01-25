package scala.com.leetcode.problems

object Solution961 {
    def repeatedNTimes(A: Array[Int]): Int = {
        val set = scala.collection.mutable.Set[Int]()
        var i = 0
        var target = 0
        for {
            i <- 0 until A.length
            if target == 0
        } {
            if (set.contains(A.apply(i))) {
                target = A.apply(i)
            } else {
                set.add(A.apply(i))
            }
        }
        target
    }
}

object P961 {
    def main(args: Array[String]): Unit = {
        println(Solution961.repeatedNTimes(Array(1,2,3,3)))
        println(Solution961.repeatedNTimes(Array(2,1,2,5,3,2)))
        println(Solution961.repeatedNTimes(Array(5,1,5,2,5,3,5,4)))
    }
}