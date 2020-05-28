//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class B4TheEnd {
    public static String theEnd(String str, boolean front){
        if(front){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1);
    }
}
