//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class A4CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
            if(isBirthday){
                if(speed <= 65){
                    return 0;
                }
                else if(speed >= 66 && speed <= 85){
                    return 1;
                }
                else if(speed >= 86){
                    return 2;
                }
            }
            if(speed <= 60){
                return 0;
            }
            else if(speed >= 61 && speed <= 80){
                return 1;
            }
            return 2;
    }
}
