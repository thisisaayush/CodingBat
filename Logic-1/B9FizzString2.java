//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class B9FizzString2 {
    public String fizzString2(int n) {
            int rem3 = n % 3;
            int rem5 = n % 5;

            if(rem3 == 0 && rem5 == 0){
                return "FizzBuzz!";
            }
            else if(rem3 == 0 && rem5 != 0){
                return "Fizz!";
            }
            else  if(rem5 == 0 && rem3 != 0){
                return "Buzz!";
            }
            return n+"!";
    }
}
