//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class A9MissingChar {
    public static String missingChar(String str, int n){
       String frontString = str.substring(0,n);
       String backString = str.substring(n + 1, str.length());
       return frontString + backString;
    }
}
