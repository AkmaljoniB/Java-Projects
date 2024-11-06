package LeetCode;

public class Longest_Palindromic_Substring{
    public String longestPalindrome(String s) {
        String max="";
        for(int i=0;i<s.length()-max.length();i++){
            for(int j=s.length();j>i&&j-i+1>max.length();j--){
                if(s.charAt(j-1)==s.charAt(i)){
                    StringBuilder sb=new StringBuilder(s.substring(i,j));
                    if(s.substring(i,j).contentEquals(sb.reverse())){
                        max=s.substring(i,j);
                        break;
                    }
                }
            }
        }
        return max;
    }
}
