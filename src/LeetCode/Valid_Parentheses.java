package LeetCode;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        int l =0;
        while (true) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            if (l==s.length())break;
            l= s.length();
        }
        return s.length() == 0;
    }
}
