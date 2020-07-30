//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has a string, it returns a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
package String1;
public class A8WithoutEnd {
    public static String withoutEnd(String str){
        if(str.length() < 2){
            return "";
        }
        return str.substring(1,str.length() - 1);
    }
}
