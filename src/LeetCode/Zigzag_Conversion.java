package LeetCode;

public class Zigzag_Conversion{
    public static void main(String[] args) {
        System.out.println(convert("A",3));
    }
    public static String convert(String s,int numRows){
        String p="";
        int l=0;
        for(int j=0;j<numRows;j++){
            int i=j;
            for(;i<s.length();i+=Math.max((numRows-1)*2,1)){
                if(l!=0&&i!=j&&j!=numRows-1)p=p+s.charAt(i-l);
                p=p+s.charAt(i);
            }
            if(j!=numRows-1&&i-l>=0&&i-l<s.length())p=p+s.charAt(i-l);
            l+=2;
        }
        return p;
    }
}