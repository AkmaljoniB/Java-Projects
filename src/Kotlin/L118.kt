package Kotlin

fun generate(numRows: Int): List<List<Int>>{
    val list:MutableList<List<Int>> = mutableListOf()
    for(i in 0 until numRows){
        val a:MutableList<Int> =mutableListOf()
        a.add(1)
        if(i>1){
            for(j in 0 until i-1)a.add(list[i-1][a.size-1]+list[i-1][a.size])
        }
        if(i>0)a.add(1)
        list.add(a)
    }
    return list
}