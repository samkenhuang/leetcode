/**
  * @address https://leetcode.com/problems/unique-email-addresses/description/
  */
package scala.com.leetcode.problems

object Solution929 {
    def numUniqueEmails(emails: Array[String]): Int = {
        val s = scala.collection.mutable.Set[String]()
        emails.map(email => {
            var local = email.split("@").apply(0).split("\\+").apply(0)
            var domain = email.split("@").apply(1)
            local = local.split("\\.").mkString("")
            s.add(local + "@" + domain)
        })
        return s.size
    }
}

object P929 {
    def main(args: Array[String]): Unit = {
        println(Solution929.numUniqueEmails(Array("test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com")))
    }
}