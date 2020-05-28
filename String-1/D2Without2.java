//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class D2Without2 {
    public static String without2(String str){
        if(str.length() < 2 ){
            return str;
        }
        if(str.substring(0,2).equals(str.substring(str.length() - 2))){
            return str.substring(2);
        }
        return str;
    }
}
