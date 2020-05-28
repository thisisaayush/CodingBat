//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp2;
public class A1StringTimes {
    public static String stringTimes(String str, int n){
        String result = "";
        for(int i = 0 ; i < n ; i++){
            result = result + str;
        }
        return result;
    }
}
