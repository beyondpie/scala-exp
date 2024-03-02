install.packages("remotes")
remotes::install_github("dbdahl/rscala/R/rscala")

library(rscala)
s <- scala()
s + 'def binomialCoefficient(n: Int, k: Int) = {
   ( 1 to k ).map( i => ( n - i + 1 ) / i.toDouble ).product.toInt
}'

s + 'println("10 choose 3 is " + binomialCoefficient(10, 3) + ".")'

choose(10, 3) == s * 'binomialCoefficient(10, 3)'

rng <- s * 'new scala.util.Random()'
