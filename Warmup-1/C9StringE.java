//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp1;
public class C9StringE {
    public static boolean stringE(String str) {
       int count = 0 ;

       for(int i = 0 ; i < str.length() ; i++){
           if(str.substring(i,i+1).equals("e")){
               count++;
           }
       }
       return (count >= 1 && count <= 3);
    }
}
