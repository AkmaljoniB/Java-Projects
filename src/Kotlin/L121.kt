package Kotlin

fun maxProfit(prices: IntArray): Int {
    var min=prices[0];
    var max=0
    for(i in 1 until prices.size){
        min=minOf(min,prices[i])
        max=maxOf(max,prices[i]-min)
    }
    return max
}