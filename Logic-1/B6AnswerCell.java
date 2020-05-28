//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class B6AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
          if(!isMorning && !isAsleep){
                return true;
            }
            else if(isMorning && isMom && !isAsleep){
                return true;
            }
            return false;
    }
}
