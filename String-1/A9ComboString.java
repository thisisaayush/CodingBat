//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class A9ComboString {
    public static String comboString(String a, String b){
        if(a.length() < b.length()){
            return a + b + a;
        }
        return b + a + b;
    }
}
