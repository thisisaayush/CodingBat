//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class B2Left2 {
    public static String left2(String str){
        if(str.length() < 2){
            return "";
        }
        return str.substring(2,str.length()) + str.substring(0,2);
    }
}
