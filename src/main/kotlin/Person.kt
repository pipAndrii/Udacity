import kotlin.random.Random

const val maxBooks = 10
class Person {

    var ownLibrary:MutableList<Book>
    var borrowedBooks:Int

    init {
        var b = Book()
        ownLibrary = mutableListOf(b)
        borrowedBooks = 0
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
                currentPage = randomPage
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
        }
    }
}