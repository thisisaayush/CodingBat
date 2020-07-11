/*Author: Aayush Shahi Thakuri
University: Minnesota State University, Mankato
This program has fronTimes method with parameters string and int. We'll say that the front of the string
is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front.
For instance: 
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"*/
package WarmUp2;
public class A2FrontTimes {
    public static String frontTimes(String str, int n){
        String result = "";
        if(str.length() < 3){
           for(int i = 0 ; i < n ; i++){
               result = result + str;
           }
           return result;
        }

        for(int i = 0 ; i < n ; i++){
            result = result + str.substring(0,3);
        }
        return result;
    }
}
