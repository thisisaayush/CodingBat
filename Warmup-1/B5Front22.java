//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class B5Front22 {
    public static String front22(String str){
        if(str.length() < 2){
            return str + str + str;
        }
        return str.substring(0,2) + str + str.substring(0,2);
    }
}
