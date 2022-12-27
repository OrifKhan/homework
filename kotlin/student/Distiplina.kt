package student

class  Distiplina(
    var distiplina:String? =null,
    var egzamen: Boolean =false
)



    fun main() {
        val distiplina1 = Distiplina("fizika", true)
        val distiplina2 = Distiplina("manematika", false)
        val distiplina3 = Distiplina("It", true)


        val ofDisciplines_: MutableList<Distiplina> = mutableListOf(distiplina1, distiplina2, distiplina3)

        val student = Student(
            "Husenzoda", "Orifkhon", "Husen",
            20, true, "TSFEU", 4, "finans", ofDisciplines_, 400.00
        )
          val student1 = Student(
            "Sherov", "Iso", "Mustafo",
            true, "USMT", 5, "Medical", ofDisciplines_, 600.00
        )
        val student2 = Student(
            "Murzoev", "Fraiddun", "Husen",
            25, true, "MSU", 1, "Matematik", ofDisciplines_, 1400.00
        )
        val student3 = Student(
            "Iddiev", "Manucher", "Goibovich",
            23, true, "MSU", 3, "Matematik", ofDisciplines_, 500.00
        )
        val student4 = Student(
            "Husenzoda", "Anusha", "Iqbol",
            20, false, "TSFEU", 3, "finans", ofDisciplines_, 300.00
        )
        val student5 = Student(
            "Rajabova", "Zulfiya", "Orifovich",
            20, false, "USMT", 4, "Medical", ofDisciplines_, 500.00
        )
        val student6 = Student(
            "Boboeba", "Zuhro", "Azamjon",
            23, false, "MSU", 4, "Matematik", ofDisciplines_, 400.00
        )
        val listOfStudent: MutableList<Student> =
            mutableListOf(student, student1, student2, student4, student5, student3, student6)

        //найти эгзамен студентов
        fun countExamination(student : Student){
            for (disciplines in student.listOfDisciplines){
                if (disciplines.egzamen == true)
                    println(disciplines.distiplina.toString())
            }
        }

        //медицинском факультете
        val medical = listOfStudent.filter {
            it.facultyDirection == "Medical"
        }
        println("студентов учатся на медицинском факультете количество: " + medical.size)

        //студентов юношей и девушек
        val listOfgril = listOfStudent.filter {
            it.male
        }
        println("студентов юношей и девушек количество: " + listOfgril.size)

        // стипендия ниже 400с экзамена

        val scholarsh = listOfStudent.filter {
            ((it.scholarshipAmount <= 400))
        }
        scholarsh.forEach{
            countExamination(it)
        }
        scholarsh.forEach() {
            println("стипендия ниже 400с " + it.lastName )
        }
        //математическом факультете МГУ
        val studentMatematik = listOfStudent.filter {
            (it.facultyDirection == "Matematik") && (it.university == "MSU")
        }
        println("студентов учатся на Механико - математическом факультете МГУ кличество: " + studentMatematik.size)


    }











