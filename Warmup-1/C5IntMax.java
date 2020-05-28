//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class C5IntMax {
    public static int intMax(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        return c;
    }
}
