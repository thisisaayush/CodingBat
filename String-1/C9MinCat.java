//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class C9MinCat {
    public static String minCat(String a, String b){
        int n = Math.min(a.length(), b.length());
        if(a.length() > b.length()){
            return a.substring(a.length() - n) + b;
        }
        return a + b.substring(b.length() - n);
    }
}
