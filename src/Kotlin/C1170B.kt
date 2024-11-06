package Kotlin

fun main(){
    var n= readln().toInt()
    val arr =readln().split(" ").map {it.toInt()}
    var max=0
    var pmax=0
    var l=0
    arr.forEach(){
        if(it>max){
            pmax=max
            max=it
        }else pmax=maxOf(pmax,it)
        if(it<pmax)l++
    }
    println(l)
}