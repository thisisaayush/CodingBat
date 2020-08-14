//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
//The program returns true if the given non-negative number is a multiple of 3 or 5, but not both.
public class B2Old35 {
    public boolean old35(int n) {
            int mult3 = n % 3;
            int mult5 = n % 5;

            if(mult3 != mult5) {
                if (mult3 == 0) {
                    return true;
                } else if (mult5 == 0) {
                    return true;
                }
            }
            return false;
    }
}
