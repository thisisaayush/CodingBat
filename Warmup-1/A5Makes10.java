//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class A5Makes10 {
    public static boolean makes10(int a, int b){
        if((a == 10 || b == 10)){
            return true;
        }
        else if(a + b == 10){
            return true;
        }
        return false;
    }
}
