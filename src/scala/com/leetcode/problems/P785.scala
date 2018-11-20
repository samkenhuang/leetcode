/**
  * @address https://leetcode.com/problems/is-graph-bipartite/description/
  * @TODO
  */
package scala.com.leetcode.problems

object Solution785 {
    def isBipartite(graph: Array[Array[Int]]): Boolean = {
        val u = scala.collection.mutable.Set[Int]()
        val v = scala.collection.mutable.Set[Int]()
        for (i <- 0 until graph.length) {
            val contains = for {
                j <- 0 until graph(i).length
                if (u.contains(graph(i)(j)))
            } yield true
            if (!v.contains(i) && !contains.toSet.contains(true)){
                u.add(i)
                for (j <- 0 until graph(i).length) {
                    v.add(graph(i)(j))
                }
            }
            else {
                for (j <- 0 until graph(i).length) {
                    u.add(graph(i)(j))
                }
            }
        }
        u.map(i => {
            if (v.contains(i)) return false
        })
        true
    }
}

object P785 {
    def main(args: Array[String]): Unit = {
        println(Solution785.isBipartite(Array(Array(3),Array(2,4),Array(1),Array(0,4), Array(1,3))))
        println(Solution785.isBipartite(Array(Array(1),Array(0,3),Array(3),Array(1,2))))
        println(Solution785.isBipartite(Array(Array(1, 3), Array(0, 2), Array(1, 3), Array(0, 2))))
        println(Solution785.isBipartite(Array(Array(1,2,3), Array(0,2), Array(0,1,3), Array(0,2))))
    }
}