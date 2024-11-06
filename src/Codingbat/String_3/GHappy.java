package Codingbat.String_3;

public class GHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));
    }

    public static boolean gHappy(String str) {
        if (str.length() == 1) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("g")) {
                if (str.substring(str.length() - 2).equals("gg")) {
                    return true;
                } else if (str.substring(str.length() - 1).equals("g")) {
                    if (i != 0 && !str.substring(i - 1, i).equals("g")) {
                        return false;
                    }
                } else if (!str.substring(i + 1, i + 2).equals("g")) {
                    if (i != 0 && !str.substring(i - 1, i).equals("g")) {
                        return false;
                    }
                } else {
                    i++;
                }
            }
        }
        return true;
    }
}