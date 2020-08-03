//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
//The program has  a string, it returns a string length 1 from its front, unless front is false, in which case 
//return a string length 1 from its back. The string will be non-empty.
public class B4TheEnd {
    public static String theEnd(String str, boolean front){
        if(front){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1);
    }
}
