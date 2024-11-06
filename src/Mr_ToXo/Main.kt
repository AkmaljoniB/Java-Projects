fun main()= repeat(readln().toInt()){
    val s = readLine()!!
    val a= s.substring(0,s.length/2)
    val b= s.substring(s.length/2)

    println(a==b)
}
