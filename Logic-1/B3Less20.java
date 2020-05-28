//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class B3Less20 {
    public boolean less20(int n) {
        int mult1 = (n + 1) % 20;
        int mult2 = (n + 2) % 20;

        if(mult1 == 0 || mult2 == 0){
            return true;
        }
        return false;
    }
}
