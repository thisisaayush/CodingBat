//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic2;
public class A6RoundSum {
    public static int roundSum(int a, int b, int c) {
        return rightMost(a) + rightMost(b) + rightMost(c);
    }
        public static int rightMost(int num ){
        int n = num % 10;
        if( n >= 5){
            return num + (10 - n);
        }
        return num - n;
    }
}