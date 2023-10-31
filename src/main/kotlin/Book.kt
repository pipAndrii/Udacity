
open class Book {

    var title: String
    var author: String
    var currentPage: Int
    var pages: Int

    constructor(title: String = "", author: String = "", currentPage: Int = 0, pages: Int = 0) {
        this.title = title
        this.author = author
        this.currentPage = currentPage
        this.pages = pages
    }

    companion object {
        const val baseUrl: String = "https://library.com/catalog/"

    }
 open   fun ReadPage()
    {

        println(  currentPage++)
    }



    fun printUrl()
    {
        println(baseUrl + this.title + ".html")

    }
    fun printBook()
    {
        println("$title + $author + $pages pages")
    }
}