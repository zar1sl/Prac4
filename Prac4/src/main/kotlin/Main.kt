fun main(args: Array<String>) {

    //1
    fun printFullName(firstName: String, lastName: String)
    {
        println(firstName + " " + lastName)
    }
    printFullName("Zarina", "Aslanova")

    //2
    var firstName = "Zarina"
    var lastName = "Aslanova"
    printFullName(firstName, lastName)

    //3
    fun calculateFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
    }
    val fullName = calculateFullName(firstName, lastName)
    println(fullName)

    //4
    fun calculateFullNameAndLength (firstName:String, lastName:String): Pair<String,Int>
    {
        return Pair("$firstName $lastName", (firstName + lastName).length)
    }

    //5
    fun function (number: Int): Boolean//позволяет возращать фолс и тру
    {
        if (number <= 1)
        // если number <=1 то условие выполняется и число не является простым и возвращается обратно
        {
            println("число не является простым")
            return false
        }

        for (i in 2..<number) { // проверка числа на то является ли оно простым

            if (number % i == 0) // % ищет остаток от деления
            {
                return false
            }
        }
        println("число является простым")
        return true
    }
}