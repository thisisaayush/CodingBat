//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
//This program has  a string, return true if it ends in "ly".
//endsLy("oddly") → true
//endsLy("y") → false
//endsLy("oddy") → false
public class B7EndsLy {
    public static boolean endsLy(String str){
        return str.endsWith("ly");
    }
}
