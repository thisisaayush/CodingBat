//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class C2HasBad {
    public static boolean hasBad(String str){
        if(str.length() < 3){
            return false;
        }
        if(str.length() == 3){
            return str.substring(0,3).equals("bad");
        }
        boolean bad1 = str.substring(0,3).equals("bad");
        boolean bad2 = str.substring(1,4).equals("bad");

        if(str.length() >= 4 && (bad1 || bad2)) {
            return true;
        }
        return false;
    }
}
