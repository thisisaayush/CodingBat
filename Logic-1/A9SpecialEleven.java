//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
//The program returns true if the given non-negative number is special.
//We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
public class A9SpecialEleven {
    public boolean specialEleven(int n) {
        int mult = n % 11;
        if(mult == 0 || mult == 1){
            return true;
        }
        return false;
    }
}
