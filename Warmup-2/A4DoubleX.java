//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
//This program returns true if the first instance of "x" in the string is immediately followed by another "x".

package WarmUp2;
public class A4DoubleX {
    public static boolean doubleX(String str){
        if(!str.contains("x") || str.isEmpty()){
            return false;
        }
        int i = str.indexOf("x");
       return str.substring(i).startsWith("xx");
    }
}
