//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class A4ParrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour){
        if(talking && (hour < 7 || hour > 20)){
            return true;
        }
        return false;
    }
}
