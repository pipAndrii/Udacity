import java.util.Random

class Puppy:Person() {

    fun playWithBook(book:Book)
    {
        var num =kotlin.random.Random.nextInt(0,100)
        if (book.pages >= num) {
            book.pages -= num
        } else {
            book.pages = 0
        }
        println("play with book ${book.pages}")
    }
}