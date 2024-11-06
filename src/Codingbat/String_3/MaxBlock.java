package Codingbat.String_3;

public class MaxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("XXBBBbbxxXXXX"));
    }
    public static int maxBlock(String str) {
        int a= 0,max=0;
        if (str.length()<2){
            return str.length();
        }
        for (int i = 1 ; i < str.length(); i ++){
            if (str.substring(i-1,i).equals(str.substring(i,i+1))){
                a++;
            } else {
                if (max<a+1) {
                    max = a+1;
                }
                a=0;
            }
        }
        if (max<a+1){
            max = a+1;
        }
        return max;
    }
}
