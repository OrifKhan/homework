package animal

class Horse(food :String, location: String ,var name:String, var voice: String):Animal(food,location){
    override fun makeNoise(stringname: String) {
        println("$stringname $voice ")
    }
    override fun eat(stringname: String){
        println("$stringname $food ")
    }
    override fun sleep(atringname: String) {
        println(" стоя $atringname лишь имитируют сон, а спят они на боку.")
    }
}