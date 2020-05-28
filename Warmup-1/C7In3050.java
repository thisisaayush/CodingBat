//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class C7In3050 {
    public static boolean in3050(int a, int b){
        boolean x = (a >= 30 && a <= 40);
        boolean y = (b >= 30 && b <= 40);
        boolean q = (a >= 40 && a <= 50);
        boolean r = (b >= 40 && b <= 50);

        if((x && y) || (q && r)){
            return true;
        }
        return false;
    }
}
