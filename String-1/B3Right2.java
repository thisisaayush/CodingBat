//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
//The program has  a string, it returns a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
public class B3Right2 {
    public static String right2(String str){
        if(str.length() < 2){
            return "";
        }
        return str.substring(str.length()-2,str.length())+str.substring(0,str.length() - 2);
    }
}
