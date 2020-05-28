//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class C3AtFirst {
    public static String atFirst(String str){
        if(str.length() < 2){
            if(str.isEmpty()){
                return "@@";
            }
            return str + "@";
        }
        return str.substring(0,2);
    }
}
