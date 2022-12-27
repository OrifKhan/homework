package student

class Student(
    var firstName: String,
    var lastName: String,
    var middleName: String,

    var male: Boolean,
    var university: String,
    var curs: Int,
    var facultyDirection: String,
    var listOfDisciplines:MutableList<Distiplina>,
    var scholarshipAmount: Double,
      ) {

          var age:Int=0

    constructor(
        firstName: String,
        lastName: String,
        middleName: String,
        _age: Int,
        male: Boolean,
        university: String,
        curs: Int,
        facultyDirection: String,
        listOfDisciplines: MutableList<Distiplina>,
        scholarshipAmount: Double
    ):this(firstName, lastName, middleName, male, university, curs, facultyDirection, listOfDisciplines, scholarshipAmount){
        this.age=_age
    }
     fun fullName(): String {
         return "$firstName $lastName $middleName"
    }
     fun talk(): String {
        val msg = listOf("hello", "i study in TSFEU", "i'm not student", "i want to be a programming")
        return msg.random()
    }
     fun aboutMe(){
         println("$firstName $lastName, $middleName," +
                 "$male,$age $university $curs $facultyDirection" +
                 "$listOfDisciplines, $scholarshipAmount")
     }

}
















