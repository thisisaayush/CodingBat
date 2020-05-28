//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class C4LastDigit {
    public boolean lastDigit(int a, int b, int c) {
            int remA = a % 10;
            int remB = b % 10;
            int remC = c % 10;

            if(remA == remB || remA == remC || remB == remC){
                return true;
            }
            return false;
    }
}
