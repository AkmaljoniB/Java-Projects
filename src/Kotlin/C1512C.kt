package Kotlin;

fun main()=repeat(readln().toInt()){
    var(a,b)=readln().split(" ").map{it.toInt()}
    var arr= readln().toCharArray()
    val n=arr.size
    var l=0
    for(i in 0 until n/2){
        if(arr[i]!=arr[n-i-1]){
            if(arr[i]=='?'||arr[n-i-1]=='?'){
                if(arr[i]=='0'||arr[n-i-1]=='0'){
                    arr[n-i-1]='0'
                    arr[i]='0'
                }else{
                    arr[i]='1'
                    arr[n-i-1]='1'
                }
            }else{
                l=-1;
                break;
            }
        }
        if(arr[i]=='0')a-=2;
        else if(arr[i]=='1')b-=2;
    }
    if(l==0){
        for(i in 0 until n/2){
            if(arr[i]=='?'){
                if(a>1){
                    arr[n-i-1]='0'
                    arr[i]='0'
                    a-=2;
                }else{
                    arr[n-i-1]='1'
                    arr[i]='1'
                    b-=2;
                }
            }
        }
        if(n%2==1){
            if(arr[n/2]=='0')a--;
            else if(arr[n/2]=='1')b--;
            else if(a>0){
                a--;
                arr[n/2]='0';
            }else{
                b--;
                arr[n/2]='1';
            }
        }
    }
    if(l==0&&a==b&&a==0){
        for(i in 0 until n)System.out.print(arr[i]);
        System.out.println();
    }else System.out.println(-1);
}