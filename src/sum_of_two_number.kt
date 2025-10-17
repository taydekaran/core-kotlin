//sum of two number
fun main(){
    println("Enter first number : ")// interpolation
    val first = readln().toInt()
    println("Enter second number : ")// interpolation
    val second  = readln().toInt()
//    return first + second    //we can not use this return statement  for "main"
    println("sum is ${first + second} ")

     largnum()
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

