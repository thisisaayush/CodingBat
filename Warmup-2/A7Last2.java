//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp2;
public class A7Last2 {
    public static int last2(String str){
      int count = 0;
      if(str.length() < 2){
          return 0;
      }
      String end = str.substring(str.length() - 2);
      for(int i = 0 ; i < str.length() - 2 ; i ++){
          String sameChar = str.substring(i, i+2);
          if(sameChar.equals(end)){
              count++;
          }
      }
      return count;
    }
}
