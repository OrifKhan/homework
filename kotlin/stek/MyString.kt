package stek


class MyString(var myString: String) {
    fun printMyString(myString: String) {
        println(myString)
    }

    fun count(string: String) {
        println(string.toCharArray().size)

    }

    fun revers(string: String) {
        val stringChar = string.toCharArray()

        for (i in stringChar.lastIndex downTo 0) {
            print(stringChar[i].toString())


        }
    }

    fun subString(indexAt: Int, indexDo: Int) {
        val arr_en = arrayListOf(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        )
        for (i in 0..arr_en.size) {
            if (i in indexAt.toInt() until indexDo.toInt()) {
                print(arr_en[i])
            }

        }

    }

    fun subString(indexDo: Int) {
        val arr_en = arrayListOf(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        )
                for (i in 0..arr_en.size) {
            if (i in 0 until indexDo.toInt()) {
                 arr_en[i].toString()
            }

        }

    }

    fun asUppercase(variable: String) {
        variable.toCharArray()
        variable.forEach {
            var v = it.hashCode().toInt()
            if (v in 97..122) v -= 32 else v
            val bytes = byteArrayOf(v.toByte())
            val string = String(bytes)
            print(string)

        }
        }
    fun asLowercase(variable: String) {
        variable.toCharArray()
        variable.forEach {
            var v = it.hashCode().toInt()
            if (v in 65..90) v += 32 else v
            val bytes = byteArrayOf(v.toByte())
            val string = String(bytes)
            print(string)

        }
    }
    fun replace(variableSimple:String,variableNumber: String  ){

        val arr_en = arrayListOf('0',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        )
                for (i in variableSimple){
                    var index=0
                            for (l in arr_en ){

                              if (i ==l){
                               print("$index ")
                         }
                                index++
                  }
              }

        for (i in variableNumber){
                    var index=0
                            for (l in arr_en ){
                               index++
                              if (i.toString().toInt() ==index){
                               print(arr_en[index])

                         }
                  }
              }
        }

    }

fun main(){
    val myString = MyString("zmKdMcz")
    myString.printMyString(myString.myString)
    myString.count(myString.myString)
    myString.revers(myString.myString)
    println(" ")
    myString.subString(3,6)
    println()
     myString.subString(6)
    println()
    myString.asUppercase(myString.myString)
    println()
    myString.asLowercase(myString.myString)
    println()
    myString.replace("abc","123")
}
