class Book {

        var dataVipusk: Int? = null
                set(value) {
                        if (value?:0 < 0) {
                                throw java.lang.RuntimeException("invalid value of year!")
                        }
                }
        var avtor: String? = null
        var nauchFantastic:Boolean =false
        var mayagkiaMtrealBook: Boolean = false
        var translatedInRusBook: Boolean = false
        var userVoz: Int? = null
                set(value) {
                        if (value?:0 < 0) {
                                throw java.lang.RuntimeException("invalid value of year!")
                        }
                }
        var curs:Int?= null
        var facultyDirection:String?=null
        var  listOfDisciplines: MutableList<String>? =null
        var scholarshipAmount:Double?= null

}
