//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class A6NearHundred {
    public static boolean nearHundred(int n){
        int x = Math.abs(n - 100);
        int y = Math.abs(n - 200);

        if(x <= 10 || y <= 10){
            return true;
        }
        return false;
    }
}
