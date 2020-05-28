//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class B5TeenSum {
    public int teenSum(int a, int b) {
        int sum = a + b;
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
            return 19;
        }
        return sum;
    }
}
