//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class C7SeeColor {
    public static String seeColor(String str){
        if(str.length() > 3 && str.substring(0,3).equals("red")){
            return "red";
        }
        if(str.length() > 4 && str.substring(0,4).equals("blue")){
            return "blue";
        }
        return "";
    }
}
