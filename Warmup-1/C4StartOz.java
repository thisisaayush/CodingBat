//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class C4StartOz {
    public static String startOz(String str){
        if(str.length() < 2){
            return "";
        }
       String result = "";
        for(int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(0) == 'o' || str.charAt(1) == 'z'){
                result = result + str.charAt(i);
            }
        }
        return result;
    }
}
