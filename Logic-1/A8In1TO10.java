//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class A8In1TO10 {
    public boolean in1To10(int n, boolean outsideMode) {
            if((n >= 1 && n <= 10) && !outsideMode){
                return true;
            }
            else if((n <= 1 && outsideMode) || (n >= 10 && outsideMode)){
                return true;
            }
            return false;
    }
}
