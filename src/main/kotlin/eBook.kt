class eBook: Book() {

    var format:String
    var words: Int

    init {
        format = "text"
        words = 0
    }
    override fun ReadPage()
    {
        words +=250
        println(words)
    }

}