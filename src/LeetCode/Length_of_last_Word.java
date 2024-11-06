package LeetCode;

public class Length_of_last_Word {
    public int lengthOfLastWord(String s) {
        String[] ars = s.split(" ");
        return ars[ars.length-1].length();
    }
}
