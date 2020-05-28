//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class B2Old35 {
    public boolean old35(int n) {
            int mult3 = n % 3;
            int mult5 = n % 5;

            if(mult3 != mult5) {
                if (mult3 == 0) {
                    return true;
                } else if (mult5 == 0) {
                    return true;
                }
            }
            return false;
    }
}
