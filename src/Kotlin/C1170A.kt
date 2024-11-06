package Kotlin

fun main(){
    var t= readln().toInt();
    while(t-->0){
        val(x,y)= readln().split(" ").map {it.toInt()}
        val a=minOf(x,y)-1;
        println("$a ${x-a} ${y-a}")
    }
}