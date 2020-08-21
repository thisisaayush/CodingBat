//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
/*
The program has an int n, return the string form of the number followed by "!". 
So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" 
instead of the number, and if the number is divisible by 5 use "Buzz", and if 
divisible by both 3 and 5, use "FizzBuzz". 
*/
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
