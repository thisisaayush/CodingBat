//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class C9GreenTicket {
    public int greenTicket(int a, int b, int c) {
            if(a == b && a == c){
                return 20;
            }
            if(a == b || b == c || a == c){
                return 10;
            }
            return 0;
    }
}
