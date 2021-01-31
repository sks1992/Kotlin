fun main(){
    val string="this is a simple string Example"
    println(string)
    println("Our string is: $string")
    println("Our String is: ${string.toUpperCase().reversed()}")

    var myName="Sandeep Kumar"
    println("My name is: ${myName}")
    println("My name in Uppercase: ${myName.toUpperCase()}")
    println("My name in reverse: ${myName.reversed()}")
}