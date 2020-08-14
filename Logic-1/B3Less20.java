//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
//The program returns true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.
public class B3Less20 {
    public boolean less20(int n) {
        int mult1 = (n + 1) % 20;
        int mult2 = (n + 2) % 20;

        if(mult1 == 0 || mult2 == 0){
            return true;
        }
        return false;
    }
}
