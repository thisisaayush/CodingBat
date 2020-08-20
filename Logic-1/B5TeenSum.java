//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
//The program has 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, 
//are extra lucky. So if either value is a teen, just return 19.
public class B5TeenSum {
    public int teenSum(int a, int b) {
        int sum = a + b;
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
            return 19;
        }
        return sum;
    }
}
