//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has a string of even length, it returns the first half. So the string "WooHoo" yields "Woo".
package String1;
public class A7FirstHalf {
    public static String firstHalf(String str){
        int len = str.length() / 2;
        return str.substring(0,len);
    }
}
