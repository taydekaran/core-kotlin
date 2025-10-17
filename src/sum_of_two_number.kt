//sum of two number
fun main(){
    NumType()
    SunOfTwoNum()
     largnum()
}

fun SunOfTwoNum(){
    println("Enter first number : ")// interpolation
    val first = readln().toInt()
    println("Enter second number : ")// interpolation
    val second  = readln().toInt()
//    return first + second    //we can not use this return statement  for "main"
    println("sum is ${first + second} ")

}

fun largnum (){
    println("Enter first number : ")
    val first = readln().toInt()
    println("Enter second number : ")
    val second = readln().toInt()
    println("Enter third number : ")
    val third = readln().toInt()

    val max = maxOf(first , second, third)
    print("number is greater  : $max")
}
//check number is positive negative or zero

  fun NumType(){
      println("Enter Number :")
      val input = readlnOrNull()?.toInt()  // it can be null
      //check  input is null
      if(input != null){
          if(input > 0) println("number is positive") ; if (input < 0) println("number is negative") ; if (input == 0) println("input is zero")

      }
  }