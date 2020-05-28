//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class B1More20 {
    public boolean more20(int n) {
            int mult = n % 20;

            if(mult == 1 || mult == 2){
                return true;
            }
            return false;
    }
}
