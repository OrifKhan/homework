fun main(args: Array<String>) {

    var book1: Book = Book()
    book1.dataVipusk = 2009
    book1.avtor = "Sino"
    book1.nauchFantastic =true
    book1.mayagkiaMtrealBook = true
    book1.translatedInRusBook = false
    book1.userVoz = 12

    var book2: Book = Book()
    book2.dataVipusk = 2010
    book2.avtor = "firdavsi"
    book2.nauchFantastic =false
    book2.mayagkiaMtrealBook = false
    book2.translatedInRusBook = true
    book2.userVoz = 4


    var book6: Book = Book()
    book6.dataVipusk = 2015
    book6.avtor = "Khayom"
    book6.nauchFantastic =true
    book6.mayagkiaMtrealBook = true
    book6.translatedInRusBook = true
    book6.userVoz = 18

    var book4: Book = Book()
    book4.dataVipusk = 2009
    book4.avtor = "Sino"
    book4.nauchFantastic =true
    book4.mayagkiaMtrealBook = true
    book4.translatedInRusBook = false
    book4.userVoz = 12

    var book5: Book = Book()
    book5.dataVipusk = 2010
    book5.avtor = "firdavsi"
    book5.nauchFantastic =false
    book5.mayagkiaMtrealBook = false
    book5.translatedInRusBook = true
    book5.userVoz = 4


    var book3: Book = Book()
    book3.dataVipusk = 2015
    book3.avtor = "Khayom"
    book3.nauchFantastic =true
    book3.mayagkiaMtrealBook = true
    book3.translatedInRusBook = true
    book3.userVoz = 18

    var book7: Book = Book()
    book7.dataVipusk = 2009
    book7.avtor = "Sino"
    book7.nauchFantastic =true
    book7.mayagkiaMtrealBook = true
    book7.translatedInRusBook = false
    book7.userVoz = 12

    var book8: Book = Book()
    book8.dataVipusk = 2010
    book8.avtor = "firdavsi"
    book8.nauchFantastic =false
    book8.mayagkiaMtrealBook = false
    book8.translatedInRusBook = true
    book8.userVoz = 4


    var book9: Book = Book()
    book9.dataVipusk = 2015
    book9.avtor = "Khayom"
    book9.nauchFantastic =true
    book9.mayagkiaMtrealBook = true
    book9.translatedInRusBook = true
    book9.userVoz = 18

    var book10: Book = Book()
    book10.dataVipusk = 2009
    book10.avtor = "Sino"
    book10.nauchFantastic =true
    book10.mayagkiaMtrealBook = true
    book10.translatedInRusBook = false
    book10.userVoz = 12

    var book11: Book = Book()
    book11.dataVipusk = 2010
    book11.avtor = "firdavsi"
    book11.nauchFantastic =false
    book11.mayagkiaMtrealBook = false
    book11.translatedInRusBook = true
    book11.userVoz = 4


    var book12: Book = Book()
    book12.dataVipusk = 2015
    book12.avtor = "Khayom"
    book12.nauchFantastic =true
    book12.mayagkiaMtrealBook = true
    book12.translatedInRusBook = true
    book12.userVoz = 18

    var book13: Book = Book()
    book13.dataVipusk = 2009
    book13.avtor = "Sino"
    book13.nauchFantastic =true
    book13.mayagkiaMtrealBook = true
    book13.translatedInRusBook = false
    book13.userVoz = 12

    var book14: Book = Book()
    book14.dataVipusk = 2010
    book14.avtor = "firdavsi"
    book14.nauchFantastic =false
    book14.mayagkiaMtrealBook = false
    book14.translatedInRusBook = true
    book14.userVoz = 4


    var book15: Book = Book()
    book15.dataVipusk = 2015
    book15.avtor = "Khayom"
    book15.nauchFantastic =true
    book15.mayagkiaMtrealBook = true
    book15.translatedInRusBook = true
    book15.userVoz = 18

    val listOfBook: MutableList<Book> = mutableListOf(book1,book2,book3, book4,
        book5,book7,book8,book9,book10,book11,book12, book13, book14, book15)

       val dataBook = listOfBook.filter() {
           (it.dataVipusk ?: 0) >= 2010
    }
    println(" книг старшый 2010 год количество: "+ dataBook.size)
    println("автор книги: ")
    dataBook.forEach {
        println(it.avtor)
    }
     println()
    val fantasticBook = listOfBook.filter() {
        it.nauchFantastic
    }
    println(" книги котори есть научной фантастике количесво: "+ fantasticBook.size)
    println("автор книги: ")
    fantasticBook.forEach {
        println(it.avtor)
    }
        println()
    val mayagkiaMtrealBook = listOfBook.filter() {
        it.mayagkiaMtrealBook
    }
    println("книги с мягким переплетом количество: "+mayagkiaMtrealBook.size)
    println("автор книги: ")
    mayagkiaMtrealBook.forEach {
        println(it.avtor)
    }
     println()
    val translatedInRusBook = listOfBook.filter() {
        it.translatedInRusBook && (it.userVoz ?: 0) >= 6
    }
    println("книги у которых есть перевод на русский язык количество: "+translatedInRusBook.size)
    println("автор книги: ")
    translatedInRusBook.forEach {
        println(it.avtor)
    }


}




