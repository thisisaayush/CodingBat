//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//The program has a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
//nTwice("Hello", 2) → "Helo"
//nTwice("Chocolate", 3) → "Choate"
package String1;
public class B8NTwice {
    public static String nTwice(String str, int n){
            return str.substring(0,n) + str.substring(str.length() - n);
    }
}
