//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class A6AlarmClock {
    public String alarmClock(int day, boolean vacation) {
            if((day >= 1 && day <= 5) && !vacation){
            return "7:00";
        }
        else if((day == 0 || day == 1) && !vacation ){
            return "10:00";
        }
        else if((day >= 1 && day <= 5) && vacation){
            return "10:00";
        }
        return "off";
    }
}
