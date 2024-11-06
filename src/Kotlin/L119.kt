package Kotlin

fun getRow(rowIndex: Int): List<Int> {
    var list:MutableList<Int> = mutableListOf()
    for(i in 0 .. rowIndex){
        val a:MutableList<Int> =mutableListOf()
        a.add(1)
        if(i>1){
            for(j in 0 until i-1)a.add(list[a.size-1]+list[a.size])
        }
        if(i>0)a.add(1)
        list=a;
    }
    return list;
}