/*def square( x: Int) = x * x
square(2)




def abs(x: Double) = if (x >0) x else -x
abs(-1)





def fac(n: Int) = {
  var r = 1
  for ( i   <-1 to n) r = r * i
  r
}

fac(2)


// recursive function
def fac2(n: Int): Int = if (n <= 0) 1 else n * fac2(n - 1)
fac2(-2)

// parameters in functionss
def decorate(str: String,left:String="[", rigth:String="]")=
  left+ str + rigth
decorate("Hello")



// variable number of arguments
def sum(args:Int* ) = {
  var result = 0
  for (arg <- args) result += arg
  result
}

sum(1,2,3,4,5)
val s = sum(1 to 5: _*)


def box(s : String) {
  val border = "-" * s.length + "--\n"
  println(border + "|" + s + "|\n" + border)
}

box("hello")


val s


import math._

def checksqr(x: Int) {
  if (x >= 0) {
    sqrt(x)
  } else throw new IllegalArgumentException("x should not be negative")
}

checksqr(-1)


var in = new URL("http://horstmann.com/fred.gif").openStream()
try {
  process(in)
} finally {
  in.close()
}*/



// newton sqrt approach
val num= Array[Int](10)
val s = Array("Hello", "world")

s(0) = "Goodbye"


import scala.collection.mutable.ArrayBuffer


// array buffer
val b = ArrayBuffer[Int]()
b += 1
b += (1,2,3,4,5)
b ++= Array(8,9,10)
b.trimEnd(5 )
b.insert(2, 6)
b.insert(2, 7, 8, 9)
b.remove(2)
b.remove(2, 3)

print(b)

val a=b.toArray

print(a)
print(a.toBuffer)

// transversing an array
for (i <- 0 until a.length)
  println( i + " :" +   a(i))

a(2)


///breeze

import breeze.linalg._
