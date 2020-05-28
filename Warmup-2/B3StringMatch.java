//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp2;
public class B3StringMatch {
    public static int stringMatch(String a, String b){
        int n = Math.min(a.length(), b.length());
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            String aSub = a.substring(i,i+2);
            String bSub = b.substring(i,i+2);
            if(aSub.equals(bSub)){
                count++;
            }
        }
        return count;
    }
}
