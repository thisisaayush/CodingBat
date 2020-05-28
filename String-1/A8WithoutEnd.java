//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class A8WithoutEnd {
    public static String withoutEnd(String str){
        if(str.length() < 2){
            return "";
        }
        return str.substring(1,str.length() - 1);
    }
}
