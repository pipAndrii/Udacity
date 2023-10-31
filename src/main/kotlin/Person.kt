import jdk.jfr.DataAmount
import kotlin.random.Random

const val maxBooks = 10
open class Person {

    var ownLibrary: MutableList<Book>
    var borrowedBooks: Int

    constructor(ownLibrary: MutableList<Book> = mutableListOf(Book()), borrowedBooks: Int = 0) {
        this.ownLibrary = ownLibrary
        this.borrowedBooks = borrowedBooks
    }

    fun canBorrow():Boolean
    {
        if(borrowedBooks >= maxBooks)
        {
            return false
        }
        else
            return true
    }
    fun generateRandomBooks(numBooks: Int) {
        if (canBorrow() == false)
        {
            println("limit of books ********************")
            return
        }

        val titles = listOf("Book1", "Book2", "Book3", "Book4", "Book5")
        val authors = listOf("Author1", "Author2", "Author3", "Author4", "Author5")

        for (i in 1..numBooks) {
            val randomTitle = titles.random()
            val randomAuthor = authors.random()
            val randomPage = Random.nextInt(0,500)
            val book = Book().apply {
                title = randomTitle
                author = randomAuthor
                pages = randomPage
                currentPage = randomPage - Random.nextInt(0,pages)
            }
            ownLibrary.add(book)

        }
        borrowedBooks +=numBooks
    }


    fun printLibrary()
    {
        for(i in ownLibrary)
        {

            i.printBook()
            i.printUrl()
            println("${i.weight()} - weight")

            i.tornPages(Random.nextInt(0,100))
            println("TORN PAGES ___ ${i.pages}")
        }
    }

    fun Book.weight():Double
    {
        return pages * 1.5
    }
    fun Book.tornPages(torn: Int) {
        if (pages >= torn) {
            pages -= torn
        } else {
            pages = 0
        }

    }
}