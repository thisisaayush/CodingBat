//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class D2EndUp {
    public static String endUp(String str){
        if(str.length() < 3){
            return str.toUpperCase();
        }
        String frontString = str.substring(0,str.length() - 3);
        return frontString + str.substring(str.length() - 3,str.length()).toUpperCase();
    }
}
