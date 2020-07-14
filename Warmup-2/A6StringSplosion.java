//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
//Given a non-empty string like "Code" return a string like "CCoCodCode".
//stringSplosion("Code") → "CCoCodCode"
//stringSplosion("abc") → "aababc"

package WarmUp2;
public class A6StringSplosion {
    public static String stringSplosion(String str){
        String result = "";
        for(int i = 0 ; i < str.length() ; i++){
            result = result + str.substring(0, i);
        }
        return result;
    }
}
