//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class C4LastChars {
    public static String lastChars(String a, String b){
        if(a.isEmpty() && b.isEmpty()){
            return "@@";
        }
        if(!a.isEmpty() && b.isEmpty()){
            return a.substring(0,1) + "@";
        }
        if(a.isEmpty() && !b.isEmpty()){
            return "@" + b.substring(b.length() - 1);
        }
            return a.substring(0,1) + b.substring(b.length() - 1);
    }
}
