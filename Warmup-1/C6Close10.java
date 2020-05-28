//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class C6Close10 {
    public static int close10(int a, int b){
        int x = Math.abs(a - 10);
        int y = Math.abs(b - 10);

        if(x < y){
            return a;
        }
        else if ( y < x){
            return b;
        }
        return 0;
    }
}
