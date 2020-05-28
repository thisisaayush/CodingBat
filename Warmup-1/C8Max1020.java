//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class C8Max1020 {
    public static int max1020(int a, int b){
        boolean x = (a >= 10 && a <= 20);
        boolean y = (b >= 10 && b <= 20);

        if(x && !y){
            return a;
        }
        else if(!x && y){
            return b;
        }
        else if(x && y){
            if(a > b){
                return a;
            }
            else {
                return b;
            }
        }
        return 0;
    }
}
