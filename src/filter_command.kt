
fun main(){
   val userlist = listOf<Int>(1,2,3,4)
   print( userlist.filter { it % 2 == 0 })

    val uerid  = listOf(
        user(1,"A"),
        user(2,"B"),
        user(3,"C")
    )
    println(uerid.filter { it.id == 2})

}

data class user(val id: Int, val name: String)


