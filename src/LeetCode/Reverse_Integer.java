package LeetCode;

public class Reverse_Integer{
    public static int reverse(int x){
        long p=0,l=(x+"").length()-1;
        if(x<0)l--;
        while(x!=0){
            p=(long)(p+x%10*Math.pow(10,l));
            x/=10;
            l--;
        }
        if(p>Math.pow(2,31)||p<Math.pow(-2,31))return 0;
        return (int)p;
    }
}
