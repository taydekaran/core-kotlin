
//generic <type>

// container class have user made class type that helps

class container<T>(var data : T){

}
// in this case we defind the specific type but  in container in this class have "T" commoun for all
class a (a: Int , b : Int){

}

fun main(){
    val obj = outer()
    obj.i
    val nested = outer.inner()
    nested.test()
}


//nested class

class outer{
   var i = 0

     class inner{
        fun test (){
            println("i am innner class")
        }
    }
}