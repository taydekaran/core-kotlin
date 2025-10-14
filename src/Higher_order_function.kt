import kotlin.math.pow

fun sum(a: Double, b : Double):Double{
    return  a + b
}
fun power(a: Double,b: Double) :Double {
    return  a.pow(b)
}
fun calculate(a: Double,b: Double,gn : (Double,Double)->Double){
    val result = gn(a,b)
}
fun main(){

    val fn :(a: Double, b: Double)->Double = :: power  // function me fuction ko assign kiya gay hai
//    println(fn(2.0,3.0))
    println("this is calculator")
    calculate(2.0,2.0,::sum)
    println("run ")
}