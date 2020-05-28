//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class C5LessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        int diff1 = Math.abs(a - b);
        int diff2 = Math.abs(a - c);
        int diff3 = Math.abs(b - c );

        if(diff1 >= 10 || diff2 >= 10 || diff3 >= 10){
            return true;
        }
        return false;
    }
}
