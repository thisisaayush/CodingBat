//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class B6StartHi {
    public static boolean startHi(String str){
        if(str.length() < 2){
            return false;
        }
        else if(str.substring(0,2).equals("hi")){
            return true;
        }
        return false;
    }
}
