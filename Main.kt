fun main(args: Array<String>) {
    var cat = Animal("cat", "cat food", 2)
    var dog = Dog("labrador")
    var animal = Animal() ///no parameter constructor call

    //Animal class instances
    animal.speak()
    cat.speak()

    //Dog class instances inherited from animals
    dog.speak()
    dog.bitePeople()

}