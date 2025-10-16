//import kotlin.time.Duration
//import kotlin.time.Duration.Companion.hours
//import kotlin.time.Duration.Companion.minutes

//fun main(){
//
//    val thirtyMinutes : Duration  = 30.minutes
//    val halfHour : Duration = 0.5.hours
//    println(thirtyMinutes == halfHour)
//
//}
//fun main(){
//    f(10)
//}
//
//fun f(x: Int) {
//    var cur = x + 1
//    while (cur % 10 == 0) cur /= 10
//    println(cur)
//}
//fun main() {
//    var n = readln().toInt() // read integer from the input
//    val reached = HashSet<Int>() // a mutable hash set
//    while (reached.add(n)) n = f(n) // iterate function f
//    println(reached.size) // print answer to the output
//}

fun getstringlength(obj : Any): Int?{
    if (obj is String && obj.length > 0) {
        return obj.length
    }
   return null
}
fun main(){

    fun printlength(obj : Any){
        println("getting the length of $obj , result is ${getstringlength(obj)} ")
    }
    printlength("taydekaran is too short and cute")
    printlength("")
    printlength(1000)
}
//output
//getting the length of taydekaran is too short and cute , result is 32
//getting the length of  , result is null
//getting the length of 1000 , result is null