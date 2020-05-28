//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class C2DelDel {
    public static String delDel(String str){
        if(str.length() < 4){
            return str;
        }
        else if (str.substring(1,4).equals("del")){
            String front = str.substring(0,1);
            String back = str.substring(4);
            return front + back;

        }
        return str;
    }
}
