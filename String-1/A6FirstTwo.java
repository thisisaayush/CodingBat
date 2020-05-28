//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class A6FirstTwo {
    public static String firstTwo(String str){
        if(str.length() < 2){
            return str;
        }
        return str.substring(0,2);
    }
}
