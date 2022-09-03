import kotlin.random.Random

open class Animal (name: String){

    constructor(name: String, whatItEats: String, age: Int) : this(name)
    constructor() : this("")

    var name = "animal"
    var whatItEats = "food"
    var age = 0


    init {
        this.name = name
        this.whatItEats = whatItEats
        this.age = age
    }

    open fun speak()
    {
        println("Hi, I'm a $name")
    }
}