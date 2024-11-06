package Kotlin


fun main()=repeat(readln().toInt()){
    val n=readln().toInt()
    val char:Array<Array<Char>> =Array(n){Array(n){' '}}
    for(i in 0 until n){
        val line= readln()
        for(j in 0 until n)char[i][j]=line[j]
    }
    var s=0
    for(i in 0 until n/2){
        for(j in 0 until(n+1)/2){
            val l: Int =char[i][j].code+char[n-1-i][n-1-j].code+char[j][n-1-i].code+char[n-1-j][i].code-'0'.code*4
            s+=minOf(l,4-l)
        }
    }
    println(s)
}