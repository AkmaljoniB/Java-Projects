package LeetCode;

public class LongestSubstringWithoutRepeatingCharacters{
    public int lengthOfLongestSubstring(String s){
        int max=0,l=0;
        for(int i=1;i<s.length();i++){
            if(s.substring(l,i).contains(s.charAt(i)+"")){
                max=Math.max(i-l,max);
                l+=s.substring(l,i).indexOf(s.charAt(i)+"")+1;
            }
        }
        return Math.max(max,s.length()-l);
    }
}