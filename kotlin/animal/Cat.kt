package animal

class Cat (food:String,location:String,var name:String,var voice: String):Animal(food, location){
    override fun makeNoise(nameAnimal: String) {
        println("$nameAnimal $voice ")
    }
    override fun eat(nameAnimal: String){
        println("$nameAnimal $food ")
    }
    override fun sleep(nameAnimal: String) {
        println("$nameAnimal 12 – 16 часов в день")
    }
}
