//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
//The program has a string, it returns a version without both the first and last char of the string. The string may be any length, including 0.
public class B5WithoutEnd2 {
    public static String withoutEnd2(String str){
        if(str.length() < 2){
            return "";
        }
        return str.substring(1,str.length()-1);
    }
}
