object test {

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double

  def isGoodEnough(guess: Double, x: Double) = ???//> isGoodEnough: (guess: Double, x: Double)Nothing

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  def sqrt(x: Double) = sqrtIter(1.0, x)          //> sqrt: (x: Double)Double
  
  sqrt(2)                                         //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at test$$anonfun$main$1.isGoodEnough$1(test.scala:9)
                                                  //| 	at test$$anonfun$main$1.sqrtIter$1(test.scala:6)
                                                  //| 	at test$$anonfun$main$1.sqrt$1(test.scala:14)
                                                  //| 	at test$$anonfun$main$1.apply$mcV$sp(test.scala:16)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at test$.main(test.scala:1)
                                                  //| 	at test.main(test.scala)
  sqrt(2)
  sqrt(1e-6)
}