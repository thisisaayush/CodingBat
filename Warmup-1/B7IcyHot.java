//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class B7IcyHot {
    public static boolean icyHot(int temp1, int temp2){
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }
}
