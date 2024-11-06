package Codingbat.Logic_2;

public class RoundSum {
    public static void main(String[] args) {
        System.out.println(roundSum(10, 10, 19));
    }
    public static int roundSum(int a, int b, int c) {
        int s = 0;
        for(int i = 5 ; i <= 14; i++){
            if(a==i || b==i || c==i){
                s=s+10;
            }
            if (a==i && b==i || a==i && c==i || b==i && c==i){
                s = s+10;
            }
        }
        for(int i = 15 ; i <= 24; i++){
            if(a==i || b==i || c==i){
                s=s+20;
            }
            if(a==i && b==i || a==i && c==i || b==i && c==i){
                s=s+20;
            }
        }
        for(int i = 25 ; i <= 34; i++){
            if(a==i || b==i || c==i){
                s=s+30;
            }
            if(a==i && b==i || a==i && c==i || b==i && c==i){
                s=s+30;
            }
        }
        for(int i = 35 ; i <= 44; i++){
            if(a==i || b==i || c==i){
                s=s+40;
            }
            if(a==i && b==i || a==i && c==i || b==i && c==i){
                s=s+40;
            }
        }
        for(int i = 45 ; i <= 54; i++){
            if(a==i || b==i || c==i){
                s=s+50;
            }
            if(a==i && b==i || a==i && c==i || b==i && c==i){
                s=s+50;
            }
        }
        return s;
    }
}