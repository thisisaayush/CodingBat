//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
/*
The program has  a number n, return true if n is in the range 1..10, 
inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
*/
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
