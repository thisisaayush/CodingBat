//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has 2 strings, a and b, return a string of the form short+long+short, with the shorter string on 
//the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0). For example:
//comboString("Hello", "hi") → "hiHellohi"
//comboString("hi", "Hello") → "hiHellohi"
package String1;
public class A9ComboString {
    public static String comboString(String a, String b){
        if(a.length() < b.length()){
            return a + b + a;
        }
        return b + a + b;
    }
}
