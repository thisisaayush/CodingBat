//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class A8NotString {
    public static String notString(String str){
        if(str.length() >= 3 && str.substring(0,3).equals("not")){
            return str;
        }
        return "not " + str;
    }
}
