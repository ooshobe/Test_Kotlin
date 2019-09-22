

fun main(args: Array<String>){
    val a = 2
    val b = 2


    if (a == b){
        println("A does infact Equal B")
    }


    if (a != b)
    {
        println("A deos not equal B")
    }


    if (a >= b)
    {
        println("A is greater than or equal to equal B")
    }
    else
    {
        println("A is lesser than or equal to equal B")
    }


    //Kotlins way of switching
    when (a)
    {
        1 -> println( "a is equal to 3" )
        2 -> println()
        3 -> println()
    }

    //function conditional check
    fun vaderisfeeling( mood : String = "angry"){
        if (mood == "angry")
        {
            println("A is greater than or equal to equal B")
        }
    }

}