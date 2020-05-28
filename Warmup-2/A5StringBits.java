//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp2;
public class A5StringBits {
    public static String stringBits(String str){
        String result = "";
        for(int i = 0 ; i < str.length() ; i += 2){
            result = result + str.charAt(i);
        }
        return result;
    }
}
