//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class B4NearTen {
    public boolean nearTen(int num) {
           int remainder = num % 10;

           if(remainder <= 2 || remainder >= 8){
               return true;
           }
           return false;

    }
}
