//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
//The program has a a non-negative number "num", return true if num is within 2 of a multiple of 10.
public class B4NearTen {
    public boolean nearTen(int num) {
           int remainder = num % 10;

           if(remainder <= 2 || remainder >= 8){
               return true;
           }
           return false;

    }
}
