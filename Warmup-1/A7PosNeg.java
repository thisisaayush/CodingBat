//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class A7PosNeg {
    public static boolean posNeg(int a, int b, boolean negative){
        if(!negative && ((a >= 0 && b < 0) || (a < 0 && b >= 0))){
                return true;
        }
        else if(negative){
            if(a < 0 && b < 0){
                return true;
            }
            return false;
        }
        return false;

    }
}
