//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class B5WithoutEnd2 {
    public static String withoutEnd2(String str){
        if(str.length() < 2){
            return "";
        }
        return str.substring(1,str.length()-1);
    }
}
