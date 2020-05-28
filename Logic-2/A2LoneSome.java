//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic2;
public class A2LoneSome {
    public int loneSum(int a, int b, int c) {
        if(a == b && b == c & c == a){
            return 0;
        }
        else if(a == b || b == c || a == c){
            if(a == b){
                return c;
            }
            else if(a == c){
                return b;
            }
            return a;
        }
        return a + b + c;
    }
}
