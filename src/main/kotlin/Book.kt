
open class Book {

    companion object {
        const val baseUrl: String = "https://library.com/catalog/"

    }
    var title: String
    var author:String
    var currentPage:Int
    init {
        title = "none"
        author = "none"
        currentPage = 0
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
        println("$title + $author + $currentPage")
    }
}