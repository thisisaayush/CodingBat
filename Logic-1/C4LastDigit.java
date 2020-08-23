//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//The program has three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. 
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
