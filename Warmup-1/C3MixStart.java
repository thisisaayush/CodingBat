//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class C3MixStart {
    public static boolean mixStart(String str){
        if(str.length() < 3){
            return false;
        }
        return (str.substring(1,3).equals("ix"));
    }
}
