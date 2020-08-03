//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
//The program has two strings, it  returns their concatenation, except omit the first char of each. The strings will be at least length 1.
public class B1NonStart {
    public static String nonStart(String a, String b){
        if(a.length() < 1 && b.length() < 1){
            return "";
        }
        return a.substring(1,a.length()) + b.substring(1,b.length());
    }
}
