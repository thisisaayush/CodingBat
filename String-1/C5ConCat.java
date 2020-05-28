//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class C5ConCat {
    public static String conCat(String a, String b){
        if(a.isEmpty() || b.isEmpty()){
            return a + b;
        }
        if(a.substring(a.length() - 1).equals(b.substring(0,1))){
            return a.substring(0,a.length()) + b.substring(1,b.length());
        }
        return a + b;
    }
}
