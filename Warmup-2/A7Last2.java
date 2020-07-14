//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
/*
This program returns the count of the number of times that a substring length 2 appears in the string and also as the last 2 
chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
*/

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
