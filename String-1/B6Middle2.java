//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
//This program has a string of even length, return a string made of the middle two chars,
//so the string "string" yields "ri". The string length will be at least 2.
//middleTwo("string") → "ri"
//middleTwo("code") → "od"
public class B6Middle2 {
    public static String middle2(String str){
        if(str.length() % 2 == 0){
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        }
        return "";
    }
}
