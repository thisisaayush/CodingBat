//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class B2Front3 {
    public static String front3(String str){
        int len = str.length();
        if(len < 3){
            return str + str + str;
        }
        String newString = str.substring(0,3);
        return newString + newString + newString;
    }
}
