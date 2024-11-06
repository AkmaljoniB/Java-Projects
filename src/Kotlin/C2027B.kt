package Kotlin

fun main()= repeat(readln().toInt()){
    val n= readln().toInt()
    val arr= readln().split(" ").map {it.toInt()}
    var min=n
    for(i in 0 until n){
        var q=i
        for(j in i+1 until n){
            if(arr[j]>arr[i])q++
        }
        min=minOf(min,q)
    }
    println(min)
}