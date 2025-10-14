
// this are the utility functions

fun main(){

    val emp = Employee()
    emp.age = 20
    emp.name = "karan"

    emp.apply {
        age = 56
        name = "tayde"
        // its last value is it type
    }
    with(emp) {
        age = 99
        name = "sham"
    }
    emp.let {
        println(it.age)
        println(it.name)

        //let mostly use in null safty
        //and defind the value in side the let block

    }
    emp.run {
        age = 35
        name ="komal"
    }
    println(emp)




}

data class Employee(var name : String = " ", var  age : Int = 18)
