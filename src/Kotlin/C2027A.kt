package Kotlin

fun main()= repeat(readln().toInt()){
    var n= readln().toInt()
    var a=0
    var b=0
    while(n-->0){
        val(w,h)= readln().split(" ").map{it.toInt()}
        a=maxOf(a,w)
        b=maxOf(b,h)
    }
    println(2*(a+b))
}