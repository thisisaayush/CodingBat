//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class A9SpecialEleven {
    public boolean specialEleven(int n) {
        int mult = n % 11;
        if(mult == 0 || mult == 1){
            return true;
        }
        return false;
    }
}
