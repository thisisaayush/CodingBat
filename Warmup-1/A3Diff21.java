//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class A3Diff21 {
    public static int diff21(int n){
        if(n <= 21){
            return 21 - n;
        }
        return Math.abs(21 - n)*2;
    }
}
