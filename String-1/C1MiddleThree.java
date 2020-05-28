//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class C1MiddleThree {
    public static String middleThree(String str){
        if(str.length() < 3){
            return str;
        }
        return str.substring(str.length()/2 - 1, str.length()/2+2);
    }
}
