//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
//Your cell phone rings. Return true if you should answer it. Normally you answer, except 
//in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
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
