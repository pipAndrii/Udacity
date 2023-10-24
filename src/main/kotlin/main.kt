import kotlin.random.Random

fun main() {
    var Andrii = Person()
  Andrii.generateRandomBooks(8)
   println(Andrii.borrowedBooks)
    Andrii.printLibrary()
println("${Andrii.canBorrow()} ----------------------------")

    Andrii.generateRandomBooks(2)
    println(Andrii.borrowedBooks)
    Andrii.printLibrary()

    println("${Andrii.canBorrow()} ----------------------------")


    Andrii.generateRandomBooks(2)
    println(Andrii.borrowedBooks)
    Andrii.printLibrary()
    println("${Andrii.canBorrow()} ----------------------------")
}
