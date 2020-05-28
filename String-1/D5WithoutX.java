//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class D5WithoutX {
    public static String withoutX(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.length() > 1 && (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x')) {
            return str.substring(1, str.length() - 1);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        }    else if(str.charAt(str.length() - 1) == 'x') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }
}
