//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp2;
public class A2FrontTimes {
    public static String frontTimes(String str, int n){
        String result = "";
        if(str.length() < 3){
           for(int i = 0 ; i < n ; i++){
               result = result + str;
           }
           return result;
        }

        for(int i = 0 ; i < n ; i++){
            result = result + str.substring(0,3);
        }
        return result;
    }
}
