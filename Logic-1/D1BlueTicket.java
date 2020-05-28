//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
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
