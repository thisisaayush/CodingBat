//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
/*
The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
*/
package Logic1;
public class A7Love6 {
    public boolean love6(int a, int b) {
        int sum = a + b;
        int diff = Math.abs(a - b);
            if(a == 6 || b == 6 ){
                return true;
            }
            else if (sum == 6){
                return true;
            }
            else if(diff == 6 ){
                return true;
            }
            return false;
    }
}
