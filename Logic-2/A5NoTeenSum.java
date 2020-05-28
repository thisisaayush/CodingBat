//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic2;
public class A5NoTeenSum {
    public int noTeenSum(int a, int b, int c) {
            return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
    public static int fixTeen(int n){
        if(n < 13 || n > 19 || n == 15 || n == 16){
            return n;
        }
        return 0;
    }
}
