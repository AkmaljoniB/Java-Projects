package LeetCode;

public class Longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        for (int j = 0; j < strs[0].length(); j++) {
            for (String str : strs) {
                if (str.length()<=j)return str;
                if (!str.substring(0, j + 1).equals(strs[0].substring(0, j + 1))) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0];
    }
}
