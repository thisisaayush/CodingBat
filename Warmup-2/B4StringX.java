//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp2;
public class B4StringX {
    public static void main(String[] args) {
        System.out.println(stringX("axheodidx"));
    }
    public static String stringX(String str){
       String result = "";

       for(int i = 0 ; i < str.length() ; i++){
           if(!(i > 0 && i < str.length() - 1 && str.substring(i,i+1).equals("x"))){
               result = result + str.charAt(i);
           }
       }
       return result;
    }
}
