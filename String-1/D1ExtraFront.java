//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class D1ExtraFront {
    public static String extraFront(String str){
        if(str.length() < 2){
            return str + str + str;
        }
        String front = str.substring(0,2);
        return front + front + front;
    }
}
