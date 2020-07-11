//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
//This program has method stringTimes with two parameters string and int. It return a larger string that is n copies of the original string.
//For instance:
//stringTimes("Hi", 2) → "HiHi"
//stringTimes("Hi", 3) → "HiHiHi"
package WarmUp2;
public class A1StringTimes {
    public static String stringTimes(String str, int n){
        String result = "";
        for(int i = 0 ; i < n ; i++){
            result = result + str;
        }
        return result;
    }
}
