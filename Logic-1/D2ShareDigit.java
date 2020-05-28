//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class D2ShareDigit {
    public boolean shareDigit(int a, int b) {
                int divA = a / 10;
                int divB = b / 10;
                int remA = a % 10;
                int remB = b % 10;


                if(divA == divB || divA == remB || divB == remA || remA == remB){
                    return true;
                }
                return false;
    }
}
