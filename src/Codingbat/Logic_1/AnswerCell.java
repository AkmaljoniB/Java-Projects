package Codingbat.Logic_1;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep){
            return false;
        }
        if (isMorning && isMom){
            return true;
        }
        if (!isAsleep && !isMom && !isMorning){
            return true;
        }
        if (isMom && !isAsleep && !isMorning){
            return true;
        }
        return false;
    }
}
