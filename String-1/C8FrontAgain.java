//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class C8FrontAgain {
    public static boolean frontAgain(String str){
        if(str.length() > 1){
            if(str.substring(0,2).equals(str.substring(str.length() - 2))){
                return true;
            }
        }
        return false;
    }
}
