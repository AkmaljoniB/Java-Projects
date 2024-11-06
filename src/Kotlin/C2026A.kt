package Kotlin;

fun main()= repeat(readln().toInt()){
    val(x,y,k)= readln().split(" ").map{it.toInt()}
    val min= minOf(x,y)
    if (min>=k){
        println("0 0 0 $k")
        println("0 0 $k 0")
    }else{
        println("${x-min} ${y-min} $x $y")
        println("0 $min $min 0")
    }
}