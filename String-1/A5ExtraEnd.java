//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
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
