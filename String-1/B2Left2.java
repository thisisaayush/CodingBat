//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
//The program has a string, it returns a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
public class B2Left2 {
    public static String left2(String str){
        if(str.length() < 2){
            return "";
        }
        return str.substring(2,str.length()) + str.substring(0,2);
    }
}
