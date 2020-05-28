//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class B1FrontBack {
    public static String frontBack(String str) {

        if(str.length() <=  1){
            return str;
        }
        String frontChar = str.substring(0, 1);
        String backChar = str.substring(str.length() - 1, str.length());
        String midString = str.substring(1, str.length() - 1);
        return backChar + midString + frontChar;

    }
}
