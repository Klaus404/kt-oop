import kotlin.random.Random

class Dog(type: String) : Animal("dog") {

    constructor(): this("Labrador")

    var type = ""
    init {
        this.type = type
    }
    override fun speak() {
        println("WOOF WOOF, I'm a dawg: $name $type")
    }

    fun bitePeople(){
        val numberOfBites = Random.nextInt(20)
        println("The $type bit $numberOfBites people.")
    }


}