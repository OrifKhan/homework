package animal

open class Dog(food:String,location: String, val name:String, val voice: String):Animal(food,location) {
    override fun makeNoise(string: String) {
        println("$string $voice ")
    }
    override fun eat(string: String){
        println("$string $food ")
    }
    override fun sleep(string: String){
        println("$string спить каждий ден")
    }
}