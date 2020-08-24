//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//The program has a blue lottery ticket, with ints a, b, and c on it. 
//This makes three pairs, which we'll call ab, bc, and ac. Consider the 
//sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10.
//Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
package Logic1;
public class D1BlueTicket {
    public int blueTicket(int a, int b, int c) {
        int sum1 = a + b;
        int sum2 = c + b;
        int sum3 = a + c;

        if(sum1 == 10 || sum2 == 10 || sum3 == 10){
            return 10;
        }
        else if(sum1 == 10 + sum2 || sum1 == 10 + sum3){
            return 5;
        }
        return 0;
    }
}
