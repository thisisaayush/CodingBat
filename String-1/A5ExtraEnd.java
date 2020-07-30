//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program  returns a new string made of 3 copies of the last 2 chars of the original string.
package String1;
public class A5ExtraEnd {
    public static String extraEnd(String str){
        if(str.length() < 2){
            return "";
        }
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }
}
