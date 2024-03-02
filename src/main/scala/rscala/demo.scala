package rscala

import org.ddahl.rscala.RClient

object RSCALA {
  def main(args: Array[String]) = {
    val R = RClient()
    val a = R.evalD0("sd(rnorm(1000, mean=%-, sd=%-))", 1.0, 2.0)
    R.eval("primes <- %-", Array(2, 3, 5, 7, 11, 13, 17, 19, 23))
    println("a from R eval: ", a)
  }
}
