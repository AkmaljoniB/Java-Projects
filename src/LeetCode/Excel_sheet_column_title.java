package LeetCode;

public class Excel_sheet_column_title {
    public String convertToTitle(int columnNumber) {
        String s = "";
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) ('A' + columnNumber%26);
            columnNumber = columnNumber/26;
            s=c+s;
        }
        return s;
    }
}
