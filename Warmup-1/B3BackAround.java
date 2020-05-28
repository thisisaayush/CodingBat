//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class B3BackAround {
    public static String backAround(String str){
        if(str.length() < 1){
            return str;
        }
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }
}
