//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class B6Middle2 {
    public static String middle2(String str){
        if(str.length() % 2 == 0){
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        }
        return "";
    }
}
