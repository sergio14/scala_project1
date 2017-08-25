object session {

  def abs(x:Double)= if(x<0) -x else x

  def sqrtIter(guess:Double, x:Double) : Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess:Double, x:Double) =
    abs( (guess * guess)- x)/ x < 0.001

  def improve(guess:Double, x:Double) =
    (guess + x/guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)

sqrt(2)
  sqrt(1e-20)
    sqrt(1029384756)
}



import breeze.linalg._
val v = DenseVector(1.0, 2.0, 3.0)

//element wise multiplication

v :* 2.0

// Element wise addition
v :+ DenseVector(4.0, 5.0, 6.0)

val v2 = DenseVector(4.0, 5.0, 6.0)

// dot product
v dot v2

// regular - and +
v + v2
v - v2
// :*/ :+ have less precedence than +/-
2.0 :* v + v2
2.0 :* v :+ v2

