package Kotlin;

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var t:Int=sc.nextInt()
    while(t-->0){
        val n:Int=sc.nextInt()
        val a = LongArray(n)
        var max:Long = 1
        for(i in 0 until n)a[i]=sc.nextLong()
        for(i in 1 until n step 2)max=maxOf(max,a[i]-a[i-1])
        if(n%2==1){
            for(i in 0 until n) {
                var ans:Long=1
                for(j in 0 until i step 2)ans=Math.max(a[j+1]-a[j],ans);
                for(j in i+1 until n-1 step 2)ans=Math.max(ans,a[j+1]-a[j]);
                max = Math.min(max, ans)
            }
        }
        println(max)
    }
}