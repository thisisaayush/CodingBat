//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
//The program returns true if the given non-negative number is 1 or 2 more than a multiple of 20.
public class B1More20 {
    public boolean more20(int n) {
            int mult = n % 20;

            if(mult == 1 || mult == 2){
                return true;
            }
            return false;
    }
}
