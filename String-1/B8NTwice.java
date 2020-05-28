//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class B8NTwice {
    public static String nTwice(String str, int n){
            return str.substring(0,n) + str.substring(str.length() - n);
    }
}
