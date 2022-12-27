package stek

class Stek {
    val listOfStek = mutableListOf<Any>()

    fun isEmptyy(listOfStek: MutableList<Stek>): Boolean {
        return (count()-1) <= 0
    }

    fun push(element : Any){
        listOfStek.add(element)
    }

    fun count() : Int{
        var counterlement = 0
        for ( item in listOfStek){
            counterlement++
        }
        return counterlement
    }

    fun poo(){
        listOfStek.removeAt(count()-1)
    }

    fun top(){
        println(listOfStek[count()-1])
    }

}

fun main(){
    val stek =Stek()
    stek.listOfStek.add(1,"orif")

}